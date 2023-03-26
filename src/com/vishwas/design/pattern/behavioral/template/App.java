package com.vishwas.design.pattern.behavioral.template;

public class App {
    public static void main(String[] args) {
        int[] nums = {9,67,4,90,34,-2,654,-78};
        Algorithm algorithm = new SelectionSort(nums);
        algorithm.sort();

    }
}
