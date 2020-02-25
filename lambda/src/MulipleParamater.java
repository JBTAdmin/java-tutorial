
public class MulipleParamater {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //lambda expression which add two number
        MulipleParamaterInterface add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 4 is: "+add.sum(5, 4));
    }

}


interface MulipleParamaterInterface {

    //here is a method with multiple parameter and int as return type
    public int sum(int a, int b);
}
