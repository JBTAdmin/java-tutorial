
public class SingleParameter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // lambda expression with single parameter num and returns square of num without any return statement
        SingleParameterInterface Square = (num) -> num*num;
        System.out.println(Square.SquareOfFive(5));
    }

}


@FunctionalInterface
interface SingleParameterInterface {

    //A method with single parameter and return type as int
    public int SquareOfFive(int s);
}
