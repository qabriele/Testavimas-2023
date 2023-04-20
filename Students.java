package org.example;

import java.util.Scanner;

public class Students {
//    String name;
//    int age;
//    String schoolName;

    public static void main(String[]args){

//        Students myName = new Students(); //kuriam objekta
//        myName.setName("Gabriele"); //parametro priskyrimas su reiksme, metodo panaudojimas
//        //     String student1 = myName.getName(); //gauname reiksmes
//        System.out.println("Mano vardas " + myName.getName()); //spausdiname i konsole
//        //objektas
//        //objektas.setName("Edgar");
//        //objektas.getName();

        class EvenOrOdd {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            }
        }
    }

//   public String setName(String name){
//        this.name = name;
//        return name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
}

