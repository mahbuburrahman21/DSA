package Loops.PrimeNumber;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Little more efficient
public class Method2 {
    static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        //startTime /= 1000;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: " );
        long n = input.nextLong();

        boolean flag = false;
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0){
                flag = true;
                break;
            }
        }
        if (n==1){
            System.out.println("Neither prime nor composite");
        } else if (flag) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        long endTime = System.currentTimeMillis();
        //endTime /= 1000;
        System.out.printf("\nTotal time taken: %d",endTime - startTime);
    }
}