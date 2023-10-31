package BubbleSort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static void bubbleSort(int array[]) {
        int size = array.length;
        // loop over each element of the array to access
        for (int i = 0; i < size - 1; i++)
            // compare the elements of the array with a loop
            for (int j = 0; j < size - i - 1; j++)
                // compare two elements in the array, do action if the first value is than next
                if (array[j] > array[j + 1]) {
                    // Swap if the elements aren't in the right order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int [] numbers = {8,7,6,3,9,2};
        Main.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.




    }

}