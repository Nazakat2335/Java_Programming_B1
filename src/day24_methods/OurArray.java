package day24_methods;
/*

      all will accept array argument

      create a method that will print the first element
      create a method that will print the last element
      create a method that will print the element/s
      length matters -> even there is middle, for odd there is one middle

   */
public class OurArray {
    public static void main(String[] args){
        int[] num={12,43,56,78,567,4567,23,567,342};//9
        int[] num2=new int[] {23,45,67};

        firstElement(num);
        lastElement(num);
        eachElementInArray(num);
        System.out.println();
        findMiddle(num);

    }
    public static void firstElement(int[] num){
        System.out.println("First Element"+ num[0]);
    }
    public static void lastElement(int[] num){
        System.out.println("Last Element"+ num[num.length-1]);
    }
    public static void eachElementInArray(int[] userArr){
        for(int each:userArr);
        System.out.println(userArr+" ");
    }
    public static void findMiddle(int[] num){
        if(num.length%2==0){
            System.out.println("Find middlle number"+num[num.length/2-1]+"and"+num[num.length/2]);
        }else {
            System.out.println("My middle is: " + num[num.length/2]);
        }

    }

}
