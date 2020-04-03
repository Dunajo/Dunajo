package main.java;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 3150, 1, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.yearProduction);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000, 2300, 3,  2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.yearProduction);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook(1600, 1100, 5, 2015);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.price + " " + oldNotebook.yearProduction);
        oldNotebook.checkPrice();


    }
}