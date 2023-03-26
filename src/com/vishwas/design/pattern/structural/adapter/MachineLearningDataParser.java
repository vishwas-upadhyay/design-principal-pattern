package com.vishwas.design.pattern.structural.adapter;

public class MachineLearningDataParser implements CSVParser{
    @Override
    public void parseCSV() {
        System.out.println("MachineLearning Data parsing");
    }
}
