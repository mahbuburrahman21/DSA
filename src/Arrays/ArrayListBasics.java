package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayListBasics {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<Double> arr3 = new ArrayList<>(); //etc.
        Vector<Double> arr4 = new Vector<>(); //Same work as ArrayList

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);
        arr.add(2,100);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

        arr.removeFirst();
        arr.removeLast();
        System.out.println(arr);

        int n = arr.size();
        System.out.println(n);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        //Collections.shuffle(arr);
        System.out.println(arr);
        // Manual reverse of array in ArrayList
        int i=0, j= arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
