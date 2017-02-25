package com.thinkbigprg.sorting.primitive;

import com.thinkbigprg.sorting.CommonSortUtil;

public class SelectionSort {

    public void sort(int[] input) {

        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }

            CommonSortUtil.swap(input, minIndex, i);

        }
    }
}
