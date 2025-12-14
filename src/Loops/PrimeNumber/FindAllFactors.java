package Loops.PrimeNumber;

import java.util.Scanner;

public class FindAllFactors {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //startTime /= 1000;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: " );
        long n = input.nextLong();


        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                System.out.printf("%d * %d = %d\n",i,(n/i),n);
            }
        }

        long endTime = System.currentTimeMillis();
        //endTime /= 1000;
        System.out.printf("\nTotal time taken: %d",endTime - startTime);
    }
}
