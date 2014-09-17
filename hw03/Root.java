// Richard Jesse Adu-Poku
// CSE 2
// Homework 3
// Program 2 Root Java Program

import java.util.Scanner;
public class Root {
    
    public static void main(String [ ] args) {
    Scanner myScanner; // produces new scanner object
    myScanner=new Scanner (System.in); // instantiates this object
    System.out.print("Enter a double: ");
    // The user inputs double here
    double number1=myScanner.nextInt();
    
    double number2=(number1)/3; // this step guesse cube root of assumed number
    System.out.println("and I print its cube root" +number2);
    // the above prints the cube root
    
    double guess=(number2*number2*number2+number1)/(3*number2*number2);
    // the above improves the estimate of cube root
    
    System.out.print("The cube root is" +guess); // Prints guess
    }
}