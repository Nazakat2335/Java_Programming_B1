package day44_map;

public class StringBufferPractice {
    public static void main(String[] args) {
        /*
    StringBuffer
        It is also an object that represent sequence fo Characters
        It is also MUTABLE, once the object is created CAN be modified
        StringBuffer is synchronized-thread safe
        We can create StringBuffer only by "new" keyword.
        It is also coming from java.lang package

 */



            StringBuffer stringBuffer = new StringBuffer("Test");
            System.out.println(stringBuffer.capacity());

            System.out.println(stringBuffer.indexOf("st"));


            stringBuffer.append("stststst");
            System.out.println(stringBuffer);

            System.out.println(stringBuffer.lastIndexOf("st"));

            stringBuffer.reverse();
            System.out.println(stringBuffer);


        }
    }



