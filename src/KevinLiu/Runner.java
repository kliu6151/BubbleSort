package KevinLiu;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arr = BubbleSort.randIntArr(5);
        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}