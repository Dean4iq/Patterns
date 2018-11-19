package behavioral.strategy;

import java.util.Arrays;

public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
