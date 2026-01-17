package Recursion;

public class FindReverse {
    static void main() {
        int n = 100;
        System.out.println(recursionReverse(n,0)); // r = newNumber
    }

    public static int recursionRev(int n, int r){
        if (n==0) return r;
        return recursionRev(n/10,r*10+n%10);
    }

    //Using r = newNum, n = num to compare with previous code.
    public static int recursionReverse(int num, int newNum){
        if (num==0) return newNum;
        return recursionReverse(num/10,newNum*10 + num%10);
    }

    public static int normalReverse(int num){
        int newNum = 0;
        while (num!=0){
            newNum *= 10;
            newNum += (num%10);
            //This two line can also be written as:
            //newNum = newNum*10 + (num%10);
            num /= 10;
        }
        return newNum;
    }
}