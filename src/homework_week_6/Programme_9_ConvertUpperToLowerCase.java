package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
        public class Programme_9_ConvertUpperToLowerCase {
        public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scan.nextLine();
        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
        obj.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scan.close();
    }        //Conversion of Uppercase to Lower case method
        public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}
