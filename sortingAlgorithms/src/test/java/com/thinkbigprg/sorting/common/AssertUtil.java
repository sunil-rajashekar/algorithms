package com.thinkbigprg.sorting.common;


import com.thinkbigprg.sorting.CommonSortUtil;
import junit.framework.Assert;

public class AssertUtil {

    public static void assertArrays(int[] input, int[] expected) {

        for (int i = 0; i < input.length; i++) {
            if (input[i] != expected[i]) {
                System.out.println("FAILED AT ARRAY POSITION :: " + i);
                System.out.println("INPUT ARRAY :: " + CommonSortUtil.print(input));
                System.out.println("EXPECTED ARRAY :: " + CommonSortUtil.print(expected));

                Assert.assertTrue(false);
            }
        }


    }
}
