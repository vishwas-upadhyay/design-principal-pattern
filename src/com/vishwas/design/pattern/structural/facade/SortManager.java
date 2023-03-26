package com.vishwas.design.pattern.structural.facade;

/*
* A facade is a class that provides a simple interface to a complex subsystem which
* contains lots of moving parts. A facade might provide limited functionality in comparison
* to working with the subsystem directly. However, it includes only those features
* that clients really care about.
* */
public class SortManager {
    Sorter bubbleSort;
    Sorter quickSort;
    Sorter mergeSort;

    public SortManager() {
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
        this.quickSort = new QuickSort();
    }

    public void doBubbleSort(){
        this.bubbleSort.sort();
    }

    public void doMergeSort(){
        this.mergeSort.sort();
    }
    public void doQuickSort(){
        this.quickSort.sort();
    }
}
