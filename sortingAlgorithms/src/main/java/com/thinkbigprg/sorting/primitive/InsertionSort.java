package com.thinkbigprg.sorting.primitive;

import com.thinkbigprg.sorting.CommonSortUtil;


public class InsertionSort {


    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && numbers[j - 1] > numbers[j]) {
                CommonSortUtil.swap(numbers, j - 1, j);
                j = j - 1;
            }

        }
    }
}
