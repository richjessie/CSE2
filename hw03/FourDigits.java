// Richard Jesse Adu-Poku
// CSE2
// Homework 3
// Program 3 Four Digits Java Program
// This program prompts the user to enter a double and prints the 
// first four digits to the right of the decimal point. 

import java.util.Scanner;
public class FourDigits {
    
    public static void main(String [ ] args) {
    Scanner myScanner; // produces new scanner object
    myScanner=new Scanner (System.in); // instantiates this object
    System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
    // the user inputs value here
    double number=myScanner.nextDouble();
    int number2=(int)number;
    number2*=10000;
    double number3=(number*10000);
    
    

    
    System.out.println("The four digits are" +(-(number2-number3)) );
    }
}
