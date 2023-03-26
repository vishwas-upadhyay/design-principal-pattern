package com.vishwas.design.pattern.behavioral.template;

public class SelectionSort extends Algorithm {

    public SelectionSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void sorting() {
        for (int i = 0; i < nums.length - 1; ++i) {

            int index = i;

            for (int j = i + 1; j < nums.length; ++j)
                if (nums[j] < nums[index])
                    index = j;

            if (index != i)
                swap(i, index);
        }
    }
}
