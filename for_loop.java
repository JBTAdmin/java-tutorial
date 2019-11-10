import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Value of i: " + i);
        }

        int j;  // declare variable outside for loop if needed beyond loop
        for (j = 4; j < 8; j++) {
            System.out.println("Value of j: " + j);
        }

        int k = 8;
        for (; k < 12; k++) {
            System.out.println("Value of k: " + k);
        }

        /*
         * Below two for statements are infinite loop hence commmented.
         */
//        for (; ; k++) {
//            System.out.println("Value of k: " + k);
//        }
//
//        for (; ; ) {
//            System.out.println("Infinite loop");
//        }


        //enhanced for loop
        String[] array = {"Hello ","Hi ","How ","are ","you?"};
        List<String> list = Arrays.asList(array);;

        for (String str: array) {
            System.out.print(str);
        }
        System.out.println("\n");

        for (String str: list){
            System.out.print(str);
        }
    }
}
