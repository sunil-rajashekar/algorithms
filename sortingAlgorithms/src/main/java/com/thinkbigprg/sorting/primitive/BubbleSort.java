package com.thinkbigprg.sorting.primitive;

import com.thinkbigprg.sorting.CommonSortUtil;

public class BubbleSort {

    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {

                if (numbers[j] > numbers[j + 1]) {
                    CommonSortUtil.swap(numbers, j + 1, j);
                }

            }
        }
    }
}
