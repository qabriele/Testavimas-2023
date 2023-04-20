package org.example;

public class Fruits {
    String name;
    String colour;
    int quantity;
    double price; //pabandyti sukurti programele, kurios pagalba vartotojai pridetu vaisiu prie saraso ir jis prisidetu

    public Fruits(String name, String colour, int quantity, double price) {
        this.name = name;
        this.colour = colour;
        this.quantity = quantity;
        this.price = price;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public String getColour (){ // public - prieiga
        return colour;
    }

    public int setQuantity (int quantity) {
        this.quantity = quantity;
        return quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double getPrice() { // double - skaicius su .00
        return price;
    }

    public static void main(String[]args) {
        Fruits fruit1 = new Fruits("Apple", "red", 0, 6); //pagal kontruktoriu
//        fruit1.setName("Apple");
//        fruit1.setColour("red");
//        fruit1.setQuantity(2);
//        fruit1.setPrice(6);
        System.out.println("Fruit's name: " + fruit1.getName());
        System.out.println("Fruit's colour: " + fruit1.getColour());
        System.out.println("Quantity: " + fruit1.getQuantity());
        System.out.println("Total price: " + fruit1.getPrice());

        if (fruit1.getQuantity() > 0) {
            System.out.println("Cia yra " + fruit1.getQuantity() + fruit1.getName());
        } else {
            System.out.println("Not enough.");
        }

        String[] fruits = {"Apple", "Banana", "Kiwi"};
        String[] fruits1 = new String[3];
        fruits1[0] = "Apple";
        fruits1[1] = "Banana";
        fruits1[2] = "Kiwi";
        System.out.println(fruits1[2]);

//        for (int x = 0; x < fruits.length; x++) {
//            System.out.println(fruits[x]);
//        }

        for (int x = 1; x < 11; x++) {
            System.out.println(x);
        }
    }
}

