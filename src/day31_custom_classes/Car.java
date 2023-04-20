package day31_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    int fuelLevel;


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

public void fillTank(){
    System.out.println("filling tank");
    fuelLevel=100;


}
public void fillTank(int level){
    System.out.println();
}
    }




