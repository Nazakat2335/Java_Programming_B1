package day37_a_abstraction.car;


import day37_a_abstraction.car.ElectricCar;

public class Tesla extends ElectricCar {
    // this starts by the card
    @Override
    public void charging() {
        System.out.println("Tesla is charging by plugin");
    }

    @Override
    public void start() {
        System.out.println("Started by card");
    }

}