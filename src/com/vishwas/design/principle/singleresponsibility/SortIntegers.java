package com.vishwas.design.principle.singleresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortIntegers {

//    So this application is waiting for 5 integers - in the range [0,10] - from the user. Then the application sorts the integers and show the result.
//    Let's create independent methods for the independent operations!

//    public static final int THRESHOLD = 5;
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to the Application!");
//
//        Scanner scanner = new Scanner(System.in);
//
//        List<Integer> nums = new ArrayList<>();
//
//        System.out.println("Enter 5 valid integers in the range [0, 10]");
//
//        while(nums.size() < THRESHOLD) {
//
//            String s = scanner.nextLine();
//
//            try {
//                Integer.parseInt(s);
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid! Try again!");
//                continue;
//            }
//
//            int num = Integer.parseInt(s);
//
//            if(num<0 || num > 10) {
//                System.out.println("Invalid range! Try again!");
//                continue;
//            }
//
//            nums.add(num);
//        }
//
//        scanner.close();
//
//        Collections.sort(nums);
//
//        for(int num : nums)
//            System.out.print(num+" ");
//    }

//#############################################################################################
//######################### Solution ##########################################################
//#############################################################################################

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        List<Integer> nums = inputProcessor();
        sortIntegers(nums);
        outputProcessor(nums);
    }

    private static List<Integer> inputProcessor() {
        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < THRESHOLD) {
            String s = scanner.nextLine();
            if (isValid(s)) {
                nums.add(Integer.parseInt(s));
            }
        }

        return nums;
    }

    private static boolean isValid(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        int num = Integer.parseInt(str);
        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    private static void sortIntegers(List<Integer> nums) {
        Collections.sort(nums);
        // Collections.sort() uses Merge sort algo for non-primitive data and Quick sort for primitive data
    }

    private static void outputProcessor(List<Integer> nums) {
        for (int num : nums) {
            System.out.println(num + "");
        }

        System.out.println("End of the Application!");
    }
}
