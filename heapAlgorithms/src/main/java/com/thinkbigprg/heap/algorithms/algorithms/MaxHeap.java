package com.thinkbigprg.heap.algorithms.algorithms;

public class MaxHeap extends AbstractHeap {

    public MaxHeap(int size) {
        super(size);
    }

    public boolean insert(int data) {
        if (current == max) {
            return false;
        }

        heap[current] = data;
        swimUp(current++);

        return true;
    }

    private void swimUp(int index) {
        int parent = (index - 1) / 2;
        int data = heap[index];

        while (index > 0 && heap[parent] < data) {
            heap[index] = heap[parent];
            index = parent;
            parent = (index - 1) / 2;
        }
        heap[index] = data;
    }

}
