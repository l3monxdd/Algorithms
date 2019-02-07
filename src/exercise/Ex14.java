package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex14 {
    //14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене,
    // ко второму не допускаются. В массиве A[n] записаны оценки экзаменующихся,
    // полученные на первом экзамене. Подсчитать, сколько человек не допущено ко второму экзамену.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArr(int size, int min, int max){
        return randArrMinAndMax.randArray(size, min,max);
    }

    public void showArr(int[] arr){
        displayArray.displayArray(arr);
    }

    public void doConditional(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=2){
                count++;
            }
        }
        System.out.println();
        System.out.println(count+" человек не допущено ко второму экзамену");
    }
}
