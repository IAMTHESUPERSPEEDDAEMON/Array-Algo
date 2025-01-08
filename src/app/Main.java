package app;

import app.utils.*;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        int searchKey = 8;
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = arrayUtils.getArray();

        //1 Show original array
        System.out.println("\nOriginal array");
        arrayUtils.getOutput(array);
        try {
            //2 Show sorted array
            System.out.println("\n-------------------------\n");
            Method mergeSortMethod = arrayUtils.getClass().getMethod("mergeSort", int[].class, int.class, int.class);
            AnnotationUtils.getAnnot(mergeSortMethod);

            System.out.println("\nSorted array");
            int[] sortedArray = arrayUtils.mergeSort(array, 0, array.length - 1);
            arrayUtils.getOutput(sortedArray);

            //2 Search array element
            System.out.println("\n-------------------------\n");
            Method searchMethod = arrayUtils.getClass().getMethod("search", int[].class, int.class);
            AnnotationUtils.getAnnot(searchMethod);

            System.out.println("\nSearch in array");
            int searchResult = arrayUtils.search(sortedArray, searchKey);
            arrayUtils.getSearchOutput(searchResult, 8);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
