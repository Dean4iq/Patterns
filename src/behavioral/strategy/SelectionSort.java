package behavioral.strategy;

import java.util.Arrays;

public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Selection sort");
        System.out.println(Arrays.toString(array));

        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int temp = array[min];
            array[min] = array[least];
            array[least] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
