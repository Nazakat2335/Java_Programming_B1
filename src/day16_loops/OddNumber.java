package day16_loops;

public class OddNumber {
    public static void main(String[] args) {
        int num = 2;

        // Print numbers from 2 to 100 which are odd numbers


        while (num <= 100) {

            if (num % 2 == 1) {
                System.out.println(num);
            }
            num++;

        }

    }
}

