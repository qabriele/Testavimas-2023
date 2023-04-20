package org.example;

public class Car {
    String make;
    String model;
    int year;

    public static void main (String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.setMake("Audi");
        car1.setModel("R8");
        car1.setYear(2022);
        System.out.println("Starting the " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear() + " ");
//        make.setMake("Audi");
//        System.out.println("Mano automobilis yra " + make.getMake());

        int x = 10;
        if(x > 10){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        }

    public Car() {
        this.model = model;
        this.make = make;
        this.year = year;
    }

        public String setMake(String make) {
            this.make = make;
            return make;
        }

        public int setYear(int year) {
        this.year = year;
        return year;
        }

        public String setModel(String model) {
        this.model = model;
        return model;
        }

        public String getMake() {
        return this.make;
        }

        public int getYear() {
        return this.year;
        }

        public String getModel() {
        return this.model;
        }

    public void start() {
        System.out.println("Starting the " + year + " " + make + " " + model);
    }

    public void drive() {
        System.out.println("Driving the " + year + " " + make + " " + model);
    }

    public void stop() {
        System.out.println("Stopping the " + year + " " + make + " " + model);
    }
}
