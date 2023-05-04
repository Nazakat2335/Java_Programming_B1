package day37_a_abstraction.car;

import day37_a_abstraction.car.Car;

public class Honda extends Car {

    @Override
    public void start () {
        System.out.println("Push the button");
    }
}