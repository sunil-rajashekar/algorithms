package com.thinkbigprg.sorting.primitive;

import com.thinkbigprg.sorting.CommonSortUtil;
import com.thinkbigprg.sorting.common.AssertUtil;
import org.junit.Test;

public class InsertionSortTest {


    @Test
    public void sort() throws Exception {

        int[] arrays = new int[]{457, 842, 12, 936, 636, 715, 84, 913, 218, 399};
        int[] expectedArray = new int[]{12, 84, 218, 399, 457, 636, 715, 842, 913, 936};

        new InsertionSort().sort(arrays);
        System.out.println(CommonSortUtil.print(arrays));

        AssertUtil.assertArrays(arrays, expectedArray);
    }

}