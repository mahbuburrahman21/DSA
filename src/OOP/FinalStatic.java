package OOP;

public class FinalStatic {
    static void main(String[] args) {
        FinalStatic fs = new FinalStatic();
        fs.fun();
        staticFun();//Called without creating any Object.
    }
    private void fun(){
        System.out.println("Fun accessed!");
    }
    private static void staticFun(){
        System.out.println("Static fin!");
    }
}