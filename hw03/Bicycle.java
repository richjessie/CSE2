// Richard Jesse Adu-Poku
// CSE2
// Homework 3
// Program 1 Bicycle Program
//This program calculates the number of counts on a cyclometer and the second
// giving the number of seconds during which the counts occured.

import java.util.Scanner;
public class Bicycle {
    
    public static void main(String [ ] args) {
    Scanner myScanner; // produces new scanner object
    myScanner=new Scanner (System.in); // instantiates this object
    System.out.print("Enter the number of counts on a cyclometer: ");
    // the user inputs value here
    int numCyclometer=myScanner.nextInt();
    
    System.out.print("Enter number of seconds of trip: ");
    int seconds=myScanner.nextInt();
    
    double wheelDiameter=27.0, //
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip;
        
        distanceTrip=numCyclometer*wheelDiameter*PI;// gives distance in inches
        distanceTrip/=inchesPerFoot*feetPerMile; // gives distance in miles
        
        System.out.println("The distance was " + distanceTrip+" miles and took"+ (seconds/secondsPerMinute));
        
        double mph=distanceTrip/((seconds/secondsPerMinute)/60);
        
        System.out.println("The average mph was " +mph); // Prints the average
        // mph 
    }
}
