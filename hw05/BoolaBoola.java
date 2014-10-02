// Richard Jesse Adu-Poku
// HW-05
// CSE02
// The program gives random statements containing three
// randomized booleans(true or false) and analyzes if the statements are
// true or false


import java.util.Scanner;
public class BoolaBoola {
    public static void main(String [ ] args){

        
        int random1=(int)((Math.random()*10)+1);
        int random2=(int)((Math.random()*10)+1);
        int random3=(int)((Math.random()*10)+1);
        // Create 3 random ints between 1 and 10
        boolean n1;
        boolean n2;
        boolean n3;
        // Initialize 3 booleans for the randoms created earlier
        
        if (random1<=5) {
            n1=true;
        }else {
            n1=false;
        }
        if (random2<=5) {
            n2=true;
        }else {
            n2=false;
        }
        if (random3<=5) {
            n3=true;
        }else {
            n3=false;
        }
        // The above makes a half chance that a true or false value to be
        // held within the booleans.
        int random4=(int)(Math.random()*4+1);
        
        Scanner myScanner=new Scanner(System.in);
        
        switch (random4){
            case 1:
                System.out.println
                ("Does "+n1+" && "+n2+" &&"+n3+" have the value true(t/T) or false(f/F)?");
                String answer=myScanner.next();
                boolean ans=false;
                if (answer.equals("t") || answer.equals("T")) {
                    ans=true;
                }
                else if (!answer.equals("f") && !answer.equals("F")) {
                    System.out.println("You did not enter t, T, f, or F");
                    return;
                }
                boolean trueVal=n1 && n2 && n3;
                if (trueVal==ans) {
                    System.out.println("Correct");
                } else{
                    System.out.println("Incorrect");
                }
                // The above uses scanner input to set the random statements to
                // true or false as a boolean
                break;
            case 2:
                System.out.println
                ("Does "+n1+" && "+n2+" || "+n3+" have the value true(t/T) or false(f/F)?");
                String answer1=myScanner.next();
                boolean ans1=false;
                if (answer1.equals("t") || answer1.equals("T")) {
                    ans1=true;
                }
                else if (!answer1.equals("f") && !answer1.equals("F")) {
                    System.out.println("You did not enter t, T, f, or F");
                    return;
                }
                boolean trueVal1=n1 && n2 || n3;
                if (trueVal1==ans1) {
                    System.out.println("Correct");
                } else{
                    System.out.println("Incorrect");
                }
                break;
            case 3:
                System.out.println
                ("Does "+n1+" || "+n2+" && "+n3+" have the value true(t/T) or false(f/F)?");
                String answer2=myScanner.next();
                boolean ans2=false;
                if (answer2.equals("t") || answer2.equals("T")) {
                    ans2=true;
                }
                else if (!answer2.equals("f") && !answer2.equals("F")) {
                    System.out.println("You did not enter t, T, f, or F");
                    return;
                }
                boolean trueVal2=n1 || n2 && n3;
                if (trueVal2==ans2) {
                    System.out.println("Correct");
                } else{
                    System.out.println("Incorrect");
                }
                break;
            case 4:
                System.out.println
                ("Does "+n1+" || "+n2+" || "+n3+" have the value true(t/T) or false(f/F)?");
                String answer3=myScanner.next();
                boolean ans3=false;
                if (answer3.equals("t") || answer3.equals("T")) {
                    ans=true;
                }
                else if (!answer3.equals("f") && !answer3.equals("F")) {
                    System.out.println("You did not enter t, T, f, or F");
                    return;
                }
                boolean trueVal3=n1 || n2 || n3;
                if (trueVal3==ans3) {
                    System.out.println("Correct");
                } else{
                    System.out.println("Incorrect");
                }
                
            }
        }
}
        
            
        