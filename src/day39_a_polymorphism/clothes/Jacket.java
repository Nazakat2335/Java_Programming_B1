package day39_a_polymorphism.clothes;
public class Jacket extends Clothes implements HashHod{

    @Override
    public void wear() {
        System.out.println("Wearing a jacket");

    }

    @Override
    public void putOnHod() {
        System.out.println("Putting the hood on");

    }
}





