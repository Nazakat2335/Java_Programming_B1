package day14_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the webpage URL: ");
        String url = input.next();

        url = url.toLowerCase();

        boolean validStart = url.startsWith("www.");

        boolean validEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");


        if (validStart && validEnd) {
            System.out.println(url + " is a correct URL");
        } else {

            if (!validStart) {
                System.out.println("URL needs to start with www.");
            }


            if (!validEnd) {
                System.out.println("URL needs to end with \n.com" +
                        "\n.edu" +
                        "\n.gov" +
                        "\n.net");
            }


        }




    }
}
