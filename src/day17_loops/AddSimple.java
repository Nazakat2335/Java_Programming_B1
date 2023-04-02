package day17_loops;

import java.util.Scanner;

public class AddSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }
}