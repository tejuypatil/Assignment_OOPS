package com.bridgelab.oops.stock;

public class StockCalculations {
    public static void main(String[] args) {
        Stock stock1=new Stock("HDFC",20,200);
        Stock stock2=new Stock("L&T",10,100);
        Stock stock3=new Stock("HCL",5,1000);

        StockPortfolio portfolio1=new StockPortfolio();

        portfolio1.add(stock1);
        portfolio1.add(stock2);
        portfolio1.add(stock3);

        double total=portfolio1.getTotalStockValue();
        System.out.println(total);

        stock1.printStockReport();
        stock2.printStockReport();
        stock3.printStockReport();
    }
}
