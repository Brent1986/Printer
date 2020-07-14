package com.company;
// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private String printerName = "default Canon";
    private int tonerLevel = 100;
    private int numberPagesPrinted = 0;
    private boolean isDoubleSided = false;

    public Printer(String printerName, int tonerLevel, int numberPagesPrinted, boolean isDoubleSided){
        if (tonerLevel > 100) tonerLevel = 100;
        if (numberPagesPrinted < 0) numberPagesPrinted =0;
        this.tonerLevel = tonerLevel;
        this.numberPagesPrinted = numberPagesPrinted;
        this.isDoubleSided = isDoubleSided;
    }

    public String filledToner(int toner){
        if (tonerLevel == 100){
            return "Toner already at 100% capacity.";
        } else {
            int availSpace = 100 - tonerLevel;
            if (toner >= availSpace){
                setTonerLevel(100);
                return availSpace + " quantity of toner used for refill, " + "printer toner level now at 100%.";
                } else {
                setTonerLevel(tonerLevel + toner);
                return "Used " + toner +" for refill, " + "printer toner level now at " + tonerLevel + "%.";
            }
        }
    }

    public String printPages(int pageCount){
        if (pageCount > tonerLevel){
            return "Not enough toner to complete job. Please refill.";
        } else {
            setNumberPagesPrinted(numberPagesPrinted+=pageCount);
            setTonerLevel(tonerLevel - pageCount);
            return pageCount + " pages printed. Toner level now at " + tonerLevel + "%.";
        }
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNumberPagesPrinted(int numberPagesPrinted) {
        this.numberPagesPrinted = numberPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }
}
