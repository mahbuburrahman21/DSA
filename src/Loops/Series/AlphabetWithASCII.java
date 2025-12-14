package Loops.Series;

public class AlphabetWithASCII {
    static void main(String[] args) {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.printf("%c -> %d\n",(char)i, i);
        }
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.printf("%c -> %d\n",(char)i, i);
        }
    }
}
