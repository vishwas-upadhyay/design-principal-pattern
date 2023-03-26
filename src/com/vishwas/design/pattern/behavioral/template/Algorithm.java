package com.vishwas.design.pattern.behavioral.template;

import java.util.Arrays;

abstract class Algorithm {

    protected int[] nums;

    public Algorithm() {

    }

    public Algorithm(int[] nums) {
        this.nums = nums;
    }

    protected void initialize() {
        System.out.println("Initializing Algo");
    }

    protected abstract void sorting();

    protected void showResult() {
        Arrays.stream(this.nums).forEach(value -> System.out.println(value));
    }

    protected final void sort() {
        initialize();
        sorting();
        showResult();
    }

    protected void swap(int j, int i) {
        int firstValue = nums[j];
        nums[j] = nums[i];
        nums[i] = firstValue;
    }
}
