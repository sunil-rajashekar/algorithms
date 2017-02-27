package com.thinkbigprg.heap.algorithms.algorithms;

public class AbstractHeap {
    final int[] heap;
    final int max;
    int current;

    AbstractHeap(int max) {
        this.max = max;
        heap = new int[max];
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n");
        for (int i = 0; i < current; i++) {
            stringBuilder.append(heap[i]).append("\t");
        }
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
