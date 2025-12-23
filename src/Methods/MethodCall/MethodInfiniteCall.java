package Methods.MethodCall;

public class MethodInfiniteCall {
    public static void mahbub(){
        System.out.println("Ek dilam");
        rabbi();
    }
    public static void rabbi(){
        System.out.println("dui dilam");
        maisha();
    }
    public static void maisha(){
        System.out.println("tin dilam");
        mahbub();
    }

    //Main
    static void main(String[] args) {
        mahbub();
    }
}
//Output -> infinite call and print