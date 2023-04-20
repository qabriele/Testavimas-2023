package org.example;

public class Masyvas {

    public static void main(String[] args) {

        int[] skaiciai = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
           boolean lyginis = false;
        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] % 2 == 0) {
                System.out.println(skaiciai[i]);
                lyginis = true;
            }

            if (!lyginis) { //! yra nelygybe
                System.out.println("Nera lyginio skaiciaus.");
            }

        }

    }
}

