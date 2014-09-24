// Richard Jesse Adu-Poku
// HW-04
// CSE02
// The program that records the semester during which a course is taken at lehigh

import java.util.Scanner;
public class CourseNumber {
    public static void main(String [ ] args){
        Scanner myScanner; // produces new scanner object
        myScanner=new Scanner (System.in); // instantiates this object
        
        System.out.println("Enter a six digit number giving the course semester- ");
        // user inputs value here
        int number=myScanner.nextInt();
        
        if(number>186510 || number < 201440){
            int digitsix=((number/100000)%10);
            int digitfive=((number/10000)%10);
            int digitfour=((number/1000)%10);
            int digitthree=((number/100)%10);
            int digittwo=((number/10)%10);
            int digitone=(number%10);
            // the above separates digits to individual variables
            if (digitone ==0) {
    
                
                switch (digittwo) {
                    case 1: System.out.println("The course was offered in the Spring semester of "
                    +digitsix +digitfive +digitfour +digitthree); break;
                    case 2: System.out.println("The course was offered in the Summer 1 semester of "
                    +digitsix +digitfive +digitfour +digitthree); break;
                    case 3: System.out.println("The course was offered in the Summer 2 semester of "
                    +digitsix +digitfive +digitfour +digitthree); break;
                    case 4: System.out.println("The course was offered in the Fall Semester of "
                    +digitsix +digitfive +digitfour +digitthree); break;
                    default: System.out.println("" +digittwo +digitone + "is not a legitimate semester");
                    // The above prints which semester and year the course is with the help of the switch command.
                
                        
                }
            }
            else {
                System.out.println("" +digittwo +digitone + "is not a legitimate semester");
                return;
                // gives an error when the conditions are not met.
            }
        }
        else {
            System.out.println("The number was outside the range [186510,201440]");
            return;
            // gives an error when conditions are not met.
        }
    }
}