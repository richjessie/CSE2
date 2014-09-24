// Richard Jesse Adu-Poku
// HW-04
// CSE02
// The program prompts the user to enter an int that gives the thousands of
// dollars of income and then writes out the amount of tax on the income.

import java.util.Scanner;
public class IncomeTax {
    public static void main(String [ ] args){
        Scanner myScanner; // produces new scanner object
        myScanner=new Scanner (System.in); // instantiates this object
        
System.out.println("Enter an int giving the amount of thousands: ");
// user inputs value here
if (myScanner.hasNextInt()) {
int nIncome=myScanner.nextInt( );
int output=nIncome *1000;
//  the above declares an if statement to test for int number entry

if (nIncome < 20) {

System.out.println("The tax rate on $" + nIncome +",000 is 5.0% and the tax is " + "$"+ (output *0.05));
// condition that if the income is less than 20 its tax will be 5%
}
else if (nIncome >= 20 && nIncome < 40) {

System.out.println("The tax rate on $" + nIncome +",000 is 7.0% and the tax is " + "$"+ (output *0.07));
// condition that if income is greater than or equal to 20 but less than 40, its tax is 7%
    }
else if (nIncome >= 40 && nIncome < 78) {

System.out.println("The tax rate on $" + nIncome +",000 is 12.0% and the tax is " + "$"+ (output *0.12));
// condition that if the income is greater than or equal to 40 but less than 78, its tax is 12%
    } 
else if (nIncome >= 78) {

System.out.println("The tax rate on $" +nIncome +",000 is 14.0% and the tax is " + "$"+ (output*0.14));
// condition that if income is greater than or equal to 78 its tax is 14%
    }

if (nIncome < 0) {
System.out.println("You did not enter a positive int");

}    
}
else { System.out.println("You did not enter an int");
return;
}

}
}





