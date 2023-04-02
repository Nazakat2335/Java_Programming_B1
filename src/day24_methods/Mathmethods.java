package day24_methods;

public class Mathmethods {
    public static void add(int num1,int num2){
        System.out.println(num1+"+"+num2+"="+(num1+num2));

    }
    public static void minus(double num1,double num2){
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }


     public static void main(String[] args){
        add(34,495);
        add(45,4564);
        minus(34.5,44.2);
        minus(30,45); //why not ignore it is int not double,because of casting double bigger than int
         System.out.println();
         divide(20,4);
         divide(20,8);
     }
    public static void divide(double num1,double num2){//3/0;
        //0/3
        if(num2==0){
            System.out.println("We can not divide by zero");
        }

    }
}
