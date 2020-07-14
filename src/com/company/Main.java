package com.company;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer("Brent's Printer",100,0,true);
        System.out.println(myPrinter.printPages(10));
        System.out.println(myPrinter.filledToner(5));
        System.out.println(myPrinter.printPages(91));
        System.out.println(myPrinter.filledToner(200));
        System.out.println("Number of pages printed total = " + myPrinter.getNumberPagesPrinted());
        System.out.println(myPrinter.filledToner(15));
    }
}
