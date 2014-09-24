// Richard Jesse Adu-Poku
// HW-04
// CSE02
// The program enters an integer for the month and then displays the number
// of days in the month


import java.util.Scanner;
public class Month {
    public static void main(String [ ] args){
        Scanner myScanner; // produces new scanner
        myScanner=new Scanner (System.in); // instantiates this object
        
        System.out.println("Enter an int giving the number of the month (1-12)- ");
        // user inputs value here
        
        if (myScanner.hasNextInt()) {
            int nMonth=myScanner.nextInt();
            // the above checks if value is an int 
            
            switch (nMonth) {
                case 1: System.out.println("The month has 31 days"); break;
                case 2: System.out.println("Enter an int giving the year-");
                int year=myScanner.nextInt();
                if ((year % 4 == 0) && (year % 100 !=0) || (year % 400==0)) {
                  // the above is used to find if the year is a leap year.  
                    System.out.println("The month has 29 days");
                    // Prints statement for leap year
                }
                else {
                    System.out.println("The month has 28 days"); } break;
                    case 3: System.out.println("The month has 31 days"); break;
                    case 4: System.out.println("The month has 30 days"); break;
                    case 5: System.out.println("The month has 31 days"); break;
                    case 6: System.out.println("The month has 30 days"); break;
                    case 7: System.out.println("The month has 31 days"); break;
                    case 8: System.out.println("The month has 31 days"); break;
                    case 9: System.out.println("The month has 30 days"); break;
                    case 10: System.out.println("The month has 31 days"); break;
                    case 11: System.out.println("The month has 30 days"); break;
                    case 12: System.out.println("The month has 31 days"); break;
                    default: System.out.println("You did not enter an int between 1 and 12");
                    // Prints the month and year of each number between 1 and 12 using the switch command.
            }
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
    }
}
        