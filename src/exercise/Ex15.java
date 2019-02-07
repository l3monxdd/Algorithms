package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex15 {
    //15. Дана последовательность чисел, среди которых имеется один нуль.
    // Вывести на печать все числа, включительно до нуля.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArr(int size, int max, int min){
        return randArrMinAndMax.randArray(size,min,max);
    }

    public void showArr(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doConditional(int [] arr){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }else if(arr[i] == 0){
                break;
            }
        }

    }
}
