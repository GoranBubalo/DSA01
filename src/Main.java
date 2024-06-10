public class Main {
    public static void main(String[] args) {

    /*
    *
    * Two variables to hold the previous two Fibonacci numbers
    A for loop that runs 18 times
    Create new Fibonacci numbers by adding the two previous ones
    Print the new Fibonacci number
    Update the variables that hold the previous two fibonacci numbers
    * */

    int numberOne = 0;
    int numberTwo = 1;

    System.out.println(numberOne);
    System.out.println(numberTwo );


        for (int i = 0 ; i < 18 ; i ++){

            int newNumber = numberOne + numberTwo;
            System.out.println(newNumber);
            numberOne = numberTwo;
            numberTwo = newNumber;


        }


    }
}