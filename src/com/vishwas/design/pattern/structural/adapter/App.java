package com.vishwas.design.pattern.structural.adapter;
/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 *
 */
public class App {
    public static void main(String[] args) {
        CSVParser realEstate = new RealEstateDataParser();
        CSVParser machineLearning = new MachineLearningDataParser();
        CSVParser stockMarket = new StockMarketDataParserAdapter(new StockMarketDataParser());

        realEstate.parseCSV();
        machineLearning.parseCSV();
        stockMarket.parseCSV();

    }
}
