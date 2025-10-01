//Assignment 1 problem 1
//Name: Vindhya Vodamodula
//Student ID: 3728392
//Multiplication table with labeled header and columns

public class MultiplactionTable {
    public static void main(String[] args) {
        //Title line
        System.out.println("Multiplication table from 1x to 12x");
        System.out.println();
        //Header row
        System.out.print("      |");
        for (int i=1; i<=12; i++) {
            System.out.printf("%5d |", i);
        }
        System.out.println();

        for (int r=1;r<=12;r++) {   //r = row number
            System.out.printf("%5d |", r);
            for (int col = 1; col <= 12; col++) {
                System.out.printf("%5d |", r * col);  //print product with space and divider
            }
            System.out.println();  // move to next row
        }

    }
}
