package day35_inheritance.book;


import day39_a_polymorphism.book.EBook;

public class Library {
    public static <EBook> void main(String[] args) {

        Book book = new Book();
        // this book object can reach 6 instances
        // book.size = 23;
        // book.duration = 45;

        Ebook ebook = new Ebook();
        // this ebook object can reach 6 instance variables from SUPER class and 2 instance variables and 1 instance method from its own class
        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft Skill";
        ebook.author = "Nadir";
        ebook.read();


        AudioBook abook = new AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Morgan Freemon";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();






    }

}
