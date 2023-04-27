package day34_b_encapsulation.pizza;

public class Pizza {
    private String size;
    private int numOfTopping;

    public Pizza(String size, int numOfTopping) {

    }

    public String getSize() {

        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("small")
                || size.equalsIgnoreCase("large")) {

            this.size = size;

        } else {
            System.out.println("The number can not  be less than 0");
        }

    }

    public double calculatePrice() {

        double price = 0;
        if (size.equalsIgnoreCase("small")) {
            price = 10 + (numOfTopping * 0.5);

        } else if (size.equalsIgnoreCase("medium")) {
            price = 12 + (numOfTopping * 0.5);

        } else if (size.equalsIgnoreCase("large")) {
            price = 14 + (numOfTopping * 0.5);
        }
        return price;
    }

    public String toString() {
        return "Pizza size: " + size + ", number of toppings " + numOfTopping + ". Total price $" + calculatePrice();
    }
}