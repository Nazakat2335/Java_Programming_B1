package day35_inheritance.person;

// Subclass -- Child Class
// Student is-a Person.
public class Student extends Person {


     public  int funLevel;


    public void study () {
        System.out.println(name + " is studying");
    }

}