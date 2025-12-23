package Methods.MethodCall;

public class MaxOfThreeInt {
    public static int maxOfThreeInt(int a, int b, int c){
        //using ternery operator
        return  (a>b && a>c) ? a : (b>a && b>c) ? b : c;
    }


    //Main
    static void main(String[] args) {
        System.out.println(maxOfThreeInt(10,20,30));
    }
}
