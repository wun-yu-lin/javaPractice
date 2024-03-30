package com.example.javapractice.basic.extend;

public class Car implements IDrive, IFixCar{
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void fix() {
        System.out.println("Fix");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.fix();

        IDrive iDrive = new Car();
        iDrive.drive();


        IFixCar iFixCar = new Car();
        iFixCar.fix();
    }
}
