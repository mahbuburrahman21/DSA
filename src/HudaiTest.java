void main() {
    System.out.println(reverse(1234));
}
public static int reverse(int num){

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

