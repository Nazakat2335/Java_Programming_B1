package day35_inheritance.book;


import day35_inheritance.person.Person;
import day35_inheritance.person.Student;

public class Building {
        public static void main(String[] args) {

            Person person=new Person();
            person.nam = "James Bond";
            person.age = 40;
            person.favoriteHobby = "spy";
            person.talk();
            //person.study();  // Since this belong specifically to the child Parent class object can NOT access.
            //person.funlevel = 30;


            Student student = new Student();
            student.name = "Tom Jerry";
            student.age = 30;
            student.favoriteHobby = "cheat";
            student.talk();
            student.funLevel = 100;
            student.study();

        }
    }

