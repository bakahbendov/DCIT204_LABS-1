import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get array size ---
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        // --- Get array elements ---
        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // --- Get target value ---
        System.out.print("\nEnter target value: ");
        int target = scanner.nextInt();

        // --- Linear Search ---
        int linearResult = Algorithms.linearSearch(array, target);
        System.out.println("\nLinear Search Result:");
        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found.");
        }

        // --- Binary Search (requires sorted array) ---
        int[] sortedArray = Algorithms.sortArray(array);
        int binaryResult = Algorithms.binarySearch(sortedArray, target);
        System.out.println("\nBinary Search Result:");
        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            if (i < sortedArray.length - 1) System.out.print(", ");
        }
        System.out.println();
        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult + " (in sorted array)");
        } else {
            System.out.println("Target not found.");
        }

        scanner.close();
    }
}
