package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {
        String app = "amazon";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";
        String[] evnArr = zones.split(",");//4elements
        // System.out.println(Arrays.toString(zonesArr));
        for (int i = 0; i < evnArr.length; i++) {
            //System.out.println(zonesArr[0]);// output:us-east-1,us-west-1 us-west-2 us-west-3;
            // System.out.println("app+"i sbeing deployed to the environment "+envArr[i]);

        }
        for (String eachEnv : evnArr) {
            System.out.println(app + "is being deployed to the environment " + evnArr);


        }
    }
}
