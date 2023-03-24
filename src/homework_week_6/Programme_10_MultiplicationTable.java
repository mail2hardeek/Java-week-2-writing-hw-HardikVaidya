package homework_week_6;

import java.util.Scanner;

/** Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
        public class Programme_10_MultiplicationTable {

        public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner abc = new Scanner(System.in);
        System.out.println("Print enter the number :  ");
        int number = abc.nextInt();
        multiplicationTableOf(number);
        //Closing the scanner object
        abc.close();

    }
        // Printing the multiplication table of entered number
        public static void multiplicationTableOf (int number) {
        System.out.println(number + " x " + 1 + " = " + (number));
    }
}
