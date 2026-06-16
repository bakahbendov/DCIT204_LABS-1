public class Algorithms {

    /**
     * Linear Search: checks each element one by one until the target is found.
     * Time Complexity: O(n)
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // target not found
    }

    /**
     * Binary Search: repeatedly halves the search space in a SORTED array.
     * Time Complexity: O(log n)
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;  // target is in the right half
            } else {
                high = mid - 1; // target is in the left half
            }
        }
        return -1; // target not found
    }

    /**
     * Sorts a copy of the array using Bubble Sort so Binary Search works correctly.
     * The original array is left unchanged.
     */
    public static int[] sortArray(int[] array) {
        int[] sorted = array.clone();
        int n = sorted.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}
