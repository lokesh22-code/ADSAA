public class QuickSortExample {

    // Quick sort function
    public static void quickSort(int[] a, int low, int high) {
        if (low >= high) return; // Base case: one element

        int pivot = a[low]; // First element as pivot
        int i = low + 1;quicksort.java:1: error: class QuickSortExample is public, should be declared in a file named QuickSortExample.java
public class QuickSortExample {
       ^
1 error

        int j = high;

        while (i <= j) {
            // Move i forward while a[i] <= pivot
            while (i <= high && a[i] <= pivot) {
                i++;
            }

            // Move j backward while a[j] > pivot
            while (j >= low && a[j] > pivot) {
                j--;
            }

            // Swap if i < j
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
quicksort.java:1: error: class QuickSortExample is public, should be declared in a file named QuickSortExample.java
public class QuickSortExample {
       ^
1 error

        // Swap pivot with a[j] (correct position)
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        // Recursively sort left and right subarrays
        quickSort(a, low, j - 1);
        quickSort(a, j + 1, high);
    }

    // Function to print array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};

        System.out.print("Original array: ");
        printArray(a);

        quickSort(a, 0, a.length - 1);

        System.out.print("Sorted array:   ");
        printArray(a);
    }
}

