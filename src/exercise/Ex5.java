package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex5 {
    //5. Дана последовательность натуральных чисел a1, a2, ..., an.
    // Создать массив из четных чисел этой последовательности.
    // Если таких чисел нет, то вывести сообщение об этом факте.

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArray(int size){
        return randomArray.randomArray(size) ;
    }

    public void displayArr(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doConditional(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i]!=0){
                count++;
                System.out.println();
                int newSize = i;
                if (newSize == 0){
                    ++newSize;
                }
                int [] tempArr = randomArray.randomArray(newSize);
                displayArr(tempArr);
            }
        }
        if (count == 0){
        System.out.println("have no non digit pair ");
        }
    }

}
