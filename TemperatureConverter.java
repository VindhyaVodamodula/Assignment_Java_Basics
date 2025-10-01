//Assignment 1 problem 2
//Name: Vindhya Vodamodula
//Student ID: 3728392
import java.util.Scanner; //using Scanner for input
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueloop = true;  //controlling variable for the loop
        while (continueloop) {
            Double temperature = null;
            while (temperature == null) {
                System.out.print("Enter temperature value: ");//getting value from user
                if (in.hasNextDouble()) {
                    temperature = in.nextDouble();
                } else {
                    String junk = in.next();
                    System.out.println("please print number.");
                }
            }
            String unit;
            while (true) {
                System.out.print("Enter unit (f or C): ");
                unit = in.next().trim().toUpperCase();
                if (unit.equalsIgnoreCase("f") || unit.equalsIgnoreCase("C")) break;
                System.out.println("unit must only enter f or C. please enter again.");
            }
                //convert
                if (unit.equalsIgnoreCase("f")) {
                    double celsius = (temperature - 32) * 5.0 / 9.0;
                    System.out.println(temperature + "degree fahrenheit= " + celsius + "degrees celsius");
                } else if (unit.equalsIgnoreCase("C")) {
                    double fahrenheit = (temperature * 9.0 / 5.0) + 32.0;
                    System.out.println(temperature + "degree celsius= " + fahrenheit + "degrees fahrenheit");
                } else {
                    System.out.println("invaalid unit. please try again f or C");
                }
                //ask if they wish to continue
                System.out.print("Continue another conversion?(y/n): ");
                String again = in.next();
                if (!again.equalsIgnoreCase("y")) {
                    System.out.println("Thank-you for using our convertor:) ");
                    continueloop = false; //exiting loop

                }



        }
    }

}
