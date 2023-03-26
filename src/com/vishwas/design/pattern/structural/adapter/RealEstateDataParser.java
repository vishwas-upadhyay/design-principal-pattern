package com.vishwas.design.pattern.structural.adapter;

public class RealEstateDataParser implements CSVParser{
    @Override
    public void parseCSV() {
        System.out.println("RealEstateData parsing");
    }
}
