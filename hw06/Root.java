// Richard Jesse Adu-Poku
// HW-06
// CSE02
// The program prompts the user to enter compute the square root of the 
// number 


import java.util.Scanner;

public class Root {
    public static void main(String [ ] args) {
        
        Scanner input;
        input=new Scanner(System.in);
        System.out.println("Please enter an integer:"); // user enters and integer
        
        int x=input.nextInt();
        if (x < 0) {
            return;
        // the above stopes the program if the input is negative
        }
        
        else {
            
        double low=0; // sets the value for low
        double high=1+x; // sets the value for high
        
        double middle=((high + low)/2.00);
        // caluclates the middle value for the input
        
        while (high-low > 0.0000001*(1+x)) {  
        if (middle*middle>x) {
        high=middle;
        // changes high to middle if the square of middle is greater than the x value
                }
        else {
            low=middle;
            // the above changes low to middle if the square of middle is not greater than x
        }        
        middle=((high-low)/2.00);
        }
        System.out.println("Root is" +middle);
        }
        
    }
}
