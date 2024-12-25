package app;

public class Main {
    public static void main(String[] args) {
        int searchKey = 8;
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = arrayUtils.getArray();

        //1 Show original array
        System.out.println("\nOriginal array");
        ArrayUtils.getArrayOutput(array);
        //2 Show sorted array
        int[] sortedArray = arrayUtils.mergeSort(array, 0, array.length - 1);
        ArrayUtils.getSortOutput(sortedArray);

        //2 Search array element
        System.out.println("\nSearch in array");
        int searchResult = arrayUtils.search(sortedArray, searchKey);
        ArrayUtils.getSearchOutput(searchResult, 8);
    }
}
