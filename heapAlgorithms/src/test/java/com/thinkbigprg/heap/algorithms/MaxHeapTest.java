package com.thinkbigprg.heap.algorithms;

import com.thinkbigprg.heap.algorithms.algorithms.MaxHeap;
import org.junit.Test;

public class MaxHeapTest {

    private MaxHeap maxHeap;

    @Test
    public void insertHeapDataSet1() throws Exception {
        maxHeap = new MaxHeap(20);

        maxHeap.insert(150);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(6);
        maxHeap.insert(100);
        maxHeap.insert(200);
        maxHeap.insert(1);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(300);

        System.out.println(maxHeap.print());
    }

    @Test
    public void insertHeapDataSet2() throws Exception {
        maxHeap = new MaxHeap(15);

        maxHeap.insert(70);
        maxHeap.insert(40);
        maxHeap.insert(50);
        maxHeap.insert(20);
        maxHeap.insert(60);
        maxHeap.insert(100);
        maxHeap.insert(80);
        maxHeap.insert(30);
        maxHeap.insert(10);
        maxHeap.insert(90);

        System.out.println(maxHeap.print());
    }

}