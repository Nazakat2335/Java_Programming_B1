package day35_inheritance.person;


//Super class -- Parent Class -- Base Class
public class Person {

    // instance variable/ fields can inherit
    public String name;
   public int age;
   public String favoriteHobby;

    // instance methods/ actions can inherit
    public void talk () {
        System.out.println(name + " is talking");
    }

}


