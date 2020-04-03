package main.java;

public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5]; {

            String animal = animals[2];
            String animal2 = animals[3];
            int numberOfElements = animals.length;

                animals[0] = "Crocodile";
                animals[1] = "Dog";
                animals[2] = "Cat";
                animals[3] = "Snake";
                animals[4] = "Bat";

                System.out.println(animals[3]);
                System.out.println(animals.length);
        }

    }
}
