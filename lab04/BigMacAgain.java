

import java.util.Scanner;
public class BigMacAgain {
    
    public static void main(String [ ] args) {
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    System.out.print("Enter the number of Big Macs (an integer > 0): ");
    if(myScanner.hasNextInt()) {
    int nBigMacs=myScanner.nextInt();
    
        double priceBurg=2.22;
        double priceFri=2.15;
        System.out.println("You ordered " +nBigMacs+" Big Macs for a cost of $" +nBigMacs*priceBurg);
        if (nBigMacs>0) {
          System.out.println("Do you want an order of fries Y/y/N/n?");
        }
        String choice=myScanner.next();
        switch (choice) {
            case "Y": case "y":
                System.out.println("You ordered fries at a cost of $" +priceFri);
                System.out.println("Total cost of the meal is $" +((nBigMacs*priceBurg)+priceFri));break;
            case "N": case "n":
                System.out.println("The total cost of your meal is $" +nBigMacs*priceBurg);break;
            default:
                System.out.println("You did not enter one of 'Y','y','N', 'n'");
        }
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
        
            
        }
}
        
        
    
