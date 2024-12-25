package app;

import java.util.Arrays;

public class ArrayUtils {
    private final int[] array = {1,5,3,6,9,11,2,4,8,12,7,10};

    public int[] getArray() {
        return array;
    }

    public int[] mergeSort(int[] elements, int low, int high) {
        // Список, що містить принаймні 2 елементи
        if (low < high) {
            int mid = (low + high) / 2;
            // Рекурсія: сортування першої половини
            mergeSort(elements, low, mid);
            // Рекурсія: сортування другої половини
            mergeSort(elements, mid + 1, high);
            // Об'єднання відсортованих половин
            merge(elements, low, mid, high);
        }
        return elements;
    }

    private void merge(int[] subset, int low,
                              int mid, int high) {

        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                temp[k++] = subset[j++];
            else if (j > high)
                temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                temp[k++] = subset[i++];
            else
                temp[k++] = subset[j++];
        }
        for (j = 0; j < n; j++)
            subset[low + j] = temp[j];
    }

    public int search(int[] sortedArray, int key) {
        // Нижній (початковий) індекс
        int low = 0;
        // Верхній (кінцевий) індекс
        int high = sortedArray.length - 1;

        while (low <= high) {
            // Середній індекс
            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    public void getSearchOutput(int index, int key) {
        System.out.println("\nSearch result: \n");
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element " + key +
                    " found at index " + index);
    }

    public void getOutput(int[] array) {
        System.out.println("Result: " + Arrays.toString(array));
    }
}

