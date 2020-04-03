package main.java;

public class Notebook {

    int weight;
    int price;
    int year;
    int yearProduction;

    public Notebook(int weight, int price, int year, int yearProduction) {

        this.weight = weight;
        this.price = price;
        this.year = year;
        this.yearProduction = yearProduction;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }


    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 700 && this.weight < 1100) {
            System.out.println("This notebook is light.");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear() {
        if (this.year < 2) {
            System.out.println("This notebook is new.");
        } else if (this.year > 2 && this.year < 4) {
            System.out.println("This notebook is used.");
        } else {
            System.out.print("This notebook is old.");
        }
    }

    public void checkYearProduction() {
        if (this.yearProduction < 2019) {
            System.out.println("This notebook is fresh");
        } else if (this.yearProduction > 2019 && this.yearProduction < 2017) {
            System.out.println("This notebook is not fresh");
        } else {
            System.out.print("This notebook stinks");
        }
    }
}