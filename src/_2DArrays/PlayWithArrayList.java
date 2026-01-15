package _2DArrays;

import java.util.ArrayList;

public class PlayWithArrayList {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        // add to the last position of the array.
        arr.add(10);arr.add(20);arr.add(30);
        //System.out.println(arr);
        arr.add(40);
        //System.out.println(arr);
        arr.add(1,90);// add to any specific position of the array.
        //System.out.println(arr);
        arr.set(0,5); // change the value at the index
        System.out.println("arr -> "+arr);
        ArrayList<Integer> brr = new ArrayList<>();
        brr.add(1);brr.add(2);brr.add(3);
        System.out.println("brr -> "+brr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(arr);
        list.add(brr);
        System.out.println("list -> "+list);
        list.get(1).set(2,25);
        System.out.println("list -> "+list);
        list.get(0).remove(1);
        System.out.println("list -> "+list);
        list.add(new ArrayList<>());
        System.out.println("list -> "+list);
        list.get(2).add(45);
        System.out.println("list -> "+list);
        list.get(2).set(0,10);
        System.out.println("list -> "+list);
    }
}
