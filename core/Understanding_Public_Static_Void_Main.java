/**
 * @author JavaBeginnersTutorial
 * @see java.lang.String
 * @see
 *
 * <a href="https://javabeginnerstutorial.com/core-java-tutorial/public-static-void-mainstring-args-explanation/"/>
 */

 public class Understanding_Public_Static_Void_Main {

    /**
     * This specific method will be invoked if you run
     * this class.
     *
     * Method argument can also be in the form of var args.
     * (String[] args) is same as (String... args)
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This method will be invoked");
    }

    /**
     * Method with same name will not create any problem
     * if method signature is different. As in this case
     * method argument is String and not String Array.
     */
    public static void main(String args) {
        System.out.println("This method will not be invoked");
    }

}
