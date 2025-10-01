//Assignment 1 problem 3
//Name: Vindhya Vodamodula
//Student ID: 3728392
public class TemperatureTables {
    //fahrenheit to celsius
    static double fToc(double f){
        return(f-32.0)*5.0/9.0;

    }
    //celsius to fahrenheit
    static double cTof(double c){
        return(c*9.0/5.0)+32.0;
    }
    public static void main(String[]args){
        double starts= -40.0;  // both tables start value
        double add= 5.0;  // addition each time
        int r= 100;  // number of rows to print
        double f=starts;  //f input
        double c= starts;  // c input
        //header
        System.out.println("           Temperature Conversion Table            ");
        System.out.println("         Temperature      |          Temperature   " );
        System.out.println("         (degrees)        |          (degrees)     ");
        System.out.println("       F            C     |         C           F   ");
        for(int loopcount=0; loopcount<r;loopcount++){
            double cResult=fToc(f); //f to c conversion
            double fResult=cTof(c);  // c to f conversion
            System.out.printf("%12.3f %12.3f | %12.3f %12.3f%n", f,cResult, c, fResult);
            //moving to the next row
            f+=add;
            c+=add;


        }
    }
}
