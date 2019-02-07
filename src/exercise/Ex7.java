package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex7 {
    //7. Дана последовательность действительных чисел a1, a2, ..., an.
    // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int [] getArr(int size){
        return randomArray.randomArray(size);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doConditional(int [] arr, int z){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > z){
                arr[i] = z;
                count++;
            }
        }
        System.out.println("replacements = " + count);
        displayArray.displayArray(arr);
    }
}
