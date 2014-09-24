// Richard Jesse Adu-Poku
// HW-04
// CSE02
// The program has the user enter a positive integer giving the number of seconds 
// that have passed during the day and then displays the time in conventional form.


import java.util.Scanner;
public class TimePadding {
    public static void main(String [ ] args){
        Scanner myScanner; // produces new scanner 
        myScanner=new Scanner (System.in); // instantiates this object
        
        System.out.println("Enter the time in seconds: ");
        // user inputs value
        int secs=myScanner.nextInt();
        if (secs > 0) {
            int hours = (secs/3600);
            int hours1 = (secs/60);
            int mins = (hours1) - (hours*60);
            int secs1 = (secs) - (hours1*60);
            // the above checks if seconds is greater than zero using if command
            // conversion of hours to seconds to minutes and back to seconds
            
            if (mins < 10) {
                // If statement that if minutes is less than 10, 0 will be added 
                // before minutes
                
            if (secs1 < 10) {
                System.out.println("The time is " +hours +":0" +mins +":0"+ secs1);
                // if statement that if seconds is less than 10, 0 will be added 
                // before seconds
            }
            else {
                System.out.println("The time is " +hours +":0" +mins +":"+ secs1);}
            }
            else {
                if (secs1 < 10){
                    System.out.println("The time is " +hours +":" +mins +":0"+ secs1);
                }
                else {
                    System.out.println("The time is " +hours +":" +mins +":"+ secs1);}
                    
                }
            }
            else{
                System.out.println("You did not enter a valid number");
                return;
                // Prints statement alerting the user about an error since seconds
                // entered earlier are not valid since they are less than 0
            }
            }
        }
