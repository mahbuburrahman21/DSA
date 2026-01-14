package _2DArrays;

import java.util.ArrayList;

public class ArrayLists {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(2); b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2); c.add(3); c.add(5); c.add(7); c.add(11);

        //ArrayList of Integer ArrayList
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
        //System.out.println(arr);

        //Traverse the ArrayList of ArrayList with normal for loop
        arr.add(new ArrayList<>());
        arr.getLast().add(10); arr.getLast().add(20);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+ "  ");
            }
            System.out.println();
        }
        System.out.println();

        //Traverse the ArrayList of ArrayList with enhanced for loop
        arr.add(new ArrayList<>());
        arr.getLast().add(10); arr.getLast().add(20);
        for (ArrayList<Integer> list : arr){
            for (int ele : list){
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}