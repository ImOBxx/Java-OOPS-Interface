
interface Sortable {
    void sort(int[] arr);
}

class Bubble implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Corrected the condition to sort in ascending order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Selection implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int temp;
        int small;

        for (int i = 0; i < n - 1; i++) { // Corrected the loop condition
            small = i;
            for (int j = i + 1; j < n; j++) { // Corrected the loop condition
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            if (i != small) {
                temp = arr[i];
                arr[i] = arr[small]; // Corrected the swap logic
                arr[small] = temp;
            }
        }
    }
}

public class SortBubbleSelection {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 0, 3, 1, 6, 8};
        int[] arr2 = {4, 2, 0, 3, 1, 6, 8}; // Separate array for selection sort to avoid pre-sorted input
        
        Bubble bubbleSort = new Bubble();
        Selection selectionSort = new Selection();

        System.out.println("Array before Bubble Sort:");
        printArray(arr1);
        bubbleSort.sort(arr1);
        System.out.println("Array after Bubble Sort:");
        printArray(arr1);

        System.out.println("Array before Selection Sort:");
        printArray(arr2);
        selectionSort.sort(arr2);
        System.out.println("Array after Selection Sort:");
        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
