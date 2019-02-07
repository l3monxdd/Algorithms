package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex9 {
    //9. Дан массив действительных чисел, размерность которого N.
    // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArray(int size, int min, int max){
        return randArrMinAndMax.randArray(size,min,max);
    }

    public void displayArray(int [] arr){
        displayArray.displayArray(arr);
    }

    public void doCondition(int [] arr){
        int negativeNum = 0;
        int positiveNum = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                positiveNum++;
            }else if (arr[i]<0){
                negativeNum++;
            }else zeroCount++;
        }
        System.out.println();
        System.out.println("positiveNum = " + positiveNum);
        System.out.println("negativeNum = " + negativeNum);
        System.out.println("zeroCount = " + zeroCount);

    }
}
