package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex6 {
    //6. Дана последовательность чисел a1, a2, ..., an.
    // Указать наименьшую длину числовой оси, содержащую все эти числа.

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();
    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();

    public int [] getArray (int size, int min, int max){
        return randArrMinAndMax.randArray(size, min, max);
    }

    public void displayArr(int [] arr){
        displayArray.displayArray(arr);
    }

    public void findNumericAxis(int[] arr){
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max){
                max =arr[i];
            }else if(arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println(" max =  "+max+" ");
        System.out.println(" min = "+min+" ");
        System.out.println();
        System.out.println("the range of numeric axis = "+(max-min));

    }
}
