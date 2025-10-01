//Assignment 1- Java Help
// problem 4
//Name: Vindhya Vodamodula
//Student ID: 3728392
import java.util.Scanner;

public class JavaHelp {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        boolean showMenu=true;
        while (showMenu){
            System.out.println(" Java Help Menu ");
            System.out.println(" Select help on: ");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("x. exit");
            System.out.print(" Selection: ");
            String option= in.next().trim();
            //handling option choosen
            switch (option){
                case"1":
                    System.out.println("If statement runs only when the condition is true");
                    System.out.println("We add elseif for more cases and else for the false branch.");
                    break;
                case"2":
                    System.out.println("The switch option selects one branch based on value.");
                    break;
                case"3":
                    System.out.println("A for loop repeats for a set number of times");
                    break;

                case"4":
                    System.out.println("A while loop repeats when its condition is true.");
                    System.out.println("it may never run if the condition is false at the start");
                    break;
                case"5":
                    System.out.println(" A do-while loop runs first and then checks the condition.");

                    break;
                case"x":
                    System.out.println(" Thank-you! goodbye:)");
                    showMenu=false;
                    break;
                default:
                    System.out.println("Invalid entry, please choose from the following menu:");

            }
        }
    }
}
