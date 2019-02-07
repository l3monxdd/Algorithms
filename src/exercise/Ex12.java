package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

import java.io.PrintStream;

public class Ex12 {
    //12. Даны натуральные числа a1, a2, ..., an.
    // Указать те, у которых остаток от деления на М равен L (0 ≤ L ≤ М – 1).

    private DisplayArray displayArray = new DisplayArrayImpl();
    private RandomArray randomArray = new RandomArrayImpl();

    public int [] getArray(int size){
        return randomArray.randomArray(size);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doCondition(int [] arr, int m){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && (m-1)>=arr[i]){
                System.out.println("arr = " + arr[i]);
            }
        }
    }
}
