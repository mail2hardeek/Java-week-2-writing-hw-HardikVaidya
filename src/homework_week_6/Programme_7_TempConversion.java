package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
         public class Programme_7_TempConversion {
         public static void main (String[]args){
        //Scanner declaration for reading input form console
         Scanner abc = new Scanner(System.in);
         System.out.println("Enter the temprature in farenheit : ");
         float temp = abc. nextFloat();
         //Obj creation
         Programme_7_TempConversion t =new Programme_7_TempConversion();
         t.convertTempToDegreeCelsius(temp);
         //closing the scannerobject
         abc.close();
    }
    //Temp conversion method
         public void convertTempToDegreeCelsius (float temp) {
         float c= ((temp-32)*5/9);
         System.out.println("The temprature " + temp + "fahrenheit is equal to " + c + "degree celsius");
    }

}
