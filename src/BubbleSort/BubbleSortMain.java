package BubbleSort;

public class BubbleSortMain {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java BubbleSortMain <integer1> <integer2> ...");
            return;
        }

        int[] inputArray = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                inputArray[i] = Integer.parseInt(args[i]);
            }

            bubbleSort(inputArray);

            System.out.print("Sorted array: ");
            for (int num : inputArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command line arguments.");
        }
    }
}