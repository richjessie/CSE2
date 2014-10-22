// Richard Jesse Adu-Poku
// CSE02
// HW07
// the Program  forces the user to enter an integer between 1 and 9, inclusive, and then prints out displays
// the numbers in stacks


import java.util.Scanner;

public class NumberStack {
    public static void main(String [ ] args) {
        
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 9-");
        int number=myScanner.nextInt();
        
        if (number<1 || number>9) {
            System.out.println("You did not enter an integer between 1 and 9");
            
        }
        else {
        for (int a = 1; a<=number; a++ ){ //this is the statement for outer loops
             for (int b=0;b<a;b++){ // this shows the next outer loop
              for (int spaces= number-a; spaces>0; spaces--){
                  // the above calculates the number of spaces
                  System.out.print(' ');
              }
              for (int row=(2*a)-1; row>0;row--){
                  System.out.print(a); 
                  // calculates the number of values in the rows
              }
             System.out.println();
              } 
              for (int space1= number-a; space1>0; space1--){
                  System.out.print(' ');
                  // calculates the second spaces for the loop
              }
              for (int numdash=(2*a)-1; numdash>0;numdash--){
                  System.out.print("-"); 
              }
              // calculates the number of dashes in the loop
              System.out.println();
            
        }
        System.out.println("That is a for Loop");
        
    // the comments for the calculations apply for all the different loops.
    
    int a = 1;
    while( a<=number) // Main outer loop
    { 
     int b = 0;
        while( b<a){ // secondary outer loop
        int spaces= number-a;
            while( spaces>0){ 
                System.out.print(' ');
                spaces--;
            } 
            int row = (2*a)-1;
            while (row >0){ 
              System.out.print(a);
              row--;
            } 
            
          System.out.println();
          b++;
            
        } 
        int space1 =number-a;
        while( space1>0){
            System.out.print(' ');
            space1--;
        }
        int numdash= (2*a)-1;
        while( numdash>0){
            System.out.print("-"); 
            numdash--;
        }
    
      System.out.println();
        a++;
    } 

 System.out.println("That is a while Loop");

a = 1;
   do 
    { // Main outer loop
     int b = 0;
        do { // Secondary outer loop
        int spaces= number-b;
            do { // start of space loop
                System.out.print(' ');
                spaces--;
            }while( spaces>0); 
            int row = (2*a)-1;
            do { 
              System.out.print(a);
              row--;
            }while (row >0); 
            
          System.out.println();
          b++;
            
        }while( b<a); 
        int space1 =number-a;
        do {
            System.out.print(' ');
            space1--;
        }while( space1>0);
        int numdash= (2*a)-1;
        do {
            System.out.print("-"); 
            numdash--;
        }while( numdash>0);
    
      System.out.println();
        a++;
    } while( a<=number); 

 System.out.println("That is a do-while Loop");
    
    

    
    
    
        }
        
        }
        
    }




        