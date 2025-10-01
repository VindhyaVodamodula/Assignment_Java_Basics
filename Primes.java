//Assignment 1
//problem 5- Primes
//Name: Vindhya Vodamodula
//Student id: 3728392
public class Primes {
    public static void main(String[]args){
        for (int num=2 ; num <= 10000; num++){
            boolean PrimeNum= true;
            //checking divisors
            for (int div=2; div*div<=num; div++){
                if (num % div == 0) {
                    PrimeNum=false;
                    break;
                }
            }
            //printing all primes
            if (PrimeNum){
                System.out.println(num);
            }

        }
    }
}
