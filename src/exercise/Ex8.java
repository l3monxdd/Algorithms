package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex8 {
    //8. Последовательность действительных чисел оканчивается нулем.
    // Найти количество членов этой последовательности.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int [] getArr (int size, int min,int max){
        return randArrMinAndMax.randArray(size,min,max);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void findConsistency(int [] arr){
        int count = 0;
        int verifyZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                verifyZero++;
                break;
            }
            while (arr[i] != 0){
                count++;
                break;
            }
        }
        if (verifyZero >= 1){
            System.out.println();
            System.out.println("count of numbers = " + count);
        }else System.out.println("have no zero");
    }
}
