package day24_methods;

public class Email {

    /*
   create a method that take two arguments as name and domain
        And print out the email address made out of the name and domain.
     */
    public static void generateEmail(String name,String domain){

        String email=name.toLowerCase()+"@"+domain.toLowerCase()+".com";
        System.out.println("Your email:"+email);
    }
    public static void generateEmailFromName(String fulName,String domain,String emailExt){
        String email = fulName.substring(0, fulName.indexOf(" ")).toLowerCase() + "@" + domain.toLowerCase() + "."+ emailExt.toLowerCase();
        System.out.println(email);


    }

    public static void main(String[] args){
        generateEmail("Gunel","Gmail");//gunel@gmail.com
        generateEmail("VAFA","YahOO");
        System.out.println();
        generateEmail("Natalia","hotMail");


    }
}
