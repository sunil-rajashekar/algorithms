package com.thinkbigprg.sorting;

public class CommonSortUtil {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static String print(int[] arrays) {
        StringBuilder sb = new StringBuilder("\n");
        for (int num : arrays) {
            sb.append(num ).append("\t");
        }

        sb.append("\n");
        return sb.toString();
    }
}
