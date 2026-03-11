public class MergeSortExample {

    public static void mergeSort(int[] a, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);

        int[] b = new int[high - low + 1];
        int i = low, j = mid + 1, h = 0;

        // Merge using while loop
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                b[h] = a[i];
                i++;
            } else {
                b[h] = a[j];
                j++;
            }
            h++;
        }

        // Copy remaining elements
        while (i <= mid) {
            b[h] = a[i];
            i++;
            h++;
        }
        while (j <= high) {
            b[h] = a[j];
            j++;
            h++;
        }

        // Copy back to main array
        for (h = 0; h < b.length; h++) {
            a[low + h] = b[h];
        }
    }

     public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        System.out.print("Original array: ");
        printArray(a);

        mergeSort(a, 0, a.length - 1);

        System.out.print("Sorted array:   ");
        printArray(a);
    }
}

