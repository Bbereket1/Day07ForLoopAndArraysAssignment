public class Arrays {
    public static void main(String[] args) {


        divisibleBy3(10);
        divisibleBy3And5(10);

    }

    /*
    Question 1

    Create a method that prints numbers from 0 to 50. BUT,
    if the number is divisible by 3, print "Fizz" instead of the number.


    Question 2

    Print numbers 0 to 50. BUT if the number is divisible by 3,
    print "Fizz" instead of the number. If the number is divisible by 5, print "Buzz".
    If the number is divisible by both 3 and 5, print "FizzBuzz".

        */



    // Question 1

    public static void divisibleBy3(int num){

        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Frizz");
            } else {
                System.out.println(i);
            }

        }
    }

    // Question 2

    public static void divisibleBy3And5(int num) {

        for (int i = 0; i < 50; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FrizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Frizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
