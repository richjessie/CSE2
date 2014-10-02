// Richard Jesse Adu-Poku
// HW-05
// CSE02
// The program prompts users to enter a choice of a burger, soda and fries an
// then prompts the users for more details of their choices.


import java.util.Scanner;
public class BurgerKing {
    public static void main(String [ ] args){
        Scanner myScanner; // produces new scanner
        myScanner=new Scanner (System.in); // instantiates this object
        
        System.out.println("Enter a letter to indicate choice of\nBurger(B or b)\nSoda(S or s)\nFries(F or f)");
    

         String letter=myScanner.next();
         
        switch (letter) {
            // this switch case provides the user the options for burger,fries or soda
            case "B": case "b":
            System.out.print("Enter A or a for 'all the fixins'\nC or c for cheese\nN or n for none of the above");
            String fixins=myScanner.next();
            switch (fixins) {
            case "A": case "a":
            System.out.println("You ordered a burger with all fixins");break;
            case "C": case "c":
                System.out.println("You ordered a burger with cheese");break;
            case "N": case "n":
                System.out.println("You ordered just a burger");break;
            default:
                System.out.println("You did not enter any fixin option");
                return;
                // the above switch case offers the user the option to enter what fixins
                // they want
                
            }
            case "S": case "s":
            System.out.print("Do you want Pepsi(p or P)\nCoke(c or C)\nSprite(s or S)\nor Mountain Dew(m or M)");
            String soda=myScanner.next();
            switch (soda) {
                case "P": case "p":
                    System.out.println("You ordered a Pepsi");break;
                case "C": case "c":
                    System.out.println("You ordered a Coke");break;
                case "S": case "s":
                    System.out.println("You ordered a Sprite");break;
                case "M": case "m":
                    System.out.println("You ordered a Mountan Dew");break;
                default:
                    System.out.println("You did not enter a choice for soda");
                    return;
                    // switch case that prompts user to enter type of soda they want
            }
            case "F": case "f":
            System.out.print("Do you want a large or small order of fries (l,L,s, or S)");
            String fries=myScanner.next();
            switch (fries) {
                case "L": case "l":
                    System.out.println("You ordered large fries");break;
                case "S": case "s":
                    System.out.println("You ordered small fries");break;
                default:
                System.out.println("You did not enter a choice for size of fries");
                return;
                // the above switch case prompts the user to enter the choice of
                // size of fries they want.
            }
            break;
            default:
            System.out.println("You did not enter any of B, b, S, s, F, or f");
            return;
            
        }
            
            
            
        }
    }

        
        
        

            
    
