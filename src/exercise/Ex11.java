package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex11 {
    //11. Даны целые числа a1 a2, .... аn.
    // Вывести на печать только те числа, для которых выполняется условие аi ≤ i.

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int [] getArray(int size){
        return randomArray.randomArray(size);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void displayConditionArray(int [] arr){
            System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= i){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
