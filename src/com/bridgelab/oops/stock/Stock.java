package com.bridgelab.oops.stock;

public class Stock {
    String name;
    int noOfShares;
    double sharePrice;

    Stock(String name, int noOFShares, double sharePrice)
    {
        this.name=name;
        this.noOfShares=noOFShares;
        this.sharePrice=sharePrice;
    }

    public void printStockReport()
    {
        double stockValue=this.noOfShares * this.sharePrice;
        System.out.println(name+" stock value is Rs:" + stockValue);
    }

    public double getStockValue()
    {
        double stockValue=this.noOfShares * this.sharePrice;
        return stockValue;
    }
}
