package Strings;

public class DeletionInsertion {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Mahbub");

        s.deleteCharAt(3);
        System.out.println(s);
        s.insert(3,'b');
        System.out.println(s);
        s.delete(3,6); // delete 3 to 5
        System.out.println(s);
    }
}
