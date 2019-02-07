package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex10 {
    //10. Даны действительные числа a1, a2, …, an.
    // Поменять местами наибольший и наименьший элементы.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();


    public int[] getArray(int size, int min, int max){
        return  randArrMinAndMax.randArray(size,min,max);
    }

    public void displayArr(int[] arr){
        displayArray.displayArray(arr);
    }

    public void doCondition(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                iMax=i;
            }else if(arr[i]< min){
                min= arr[i];
                iMin=i;
            }
        }

        arr[iMax] = min;
        arr[iMin] = max;

        System.out.println();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println();
        displayArray.displayArray(arr);
    }
}
