package behavioral.strategy;

import java.util.Arrays;

public class BubbleSort implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(array));

        for (int i = array.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
