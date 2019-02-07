package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex4 {
//    4. Дана последовательность действительных чисел a1, a2, ..., an.
//            Выяснить, будет ли она возрастающей.

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArray(int size){
        return randomArray.randomArray(size);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doConditional(int [] arr){
        int number = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]>0){
                number++;
            }
        }
        System.out.println();
        int len = arr.length-1;
        System.out.println("arr length "+arr.length);
        System.out.println("number "+number);
        if (number==arr.length-1){
            System.out.println("growing up");
        }else System.out.println("aren't growing up");
    }


}
