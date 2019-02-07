package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex21 {
    //21. Дана последовательность действительных чисел a1, a2, ..., аn.
    // Указать те ее элементы, которые принадлежат отрезку [с, d].

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public void doConditional(int n, int c, int d, int min, int max) {
        int[] arr = randArrMinAndMax.randArray(n, min, max);
        displayArray.displayArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= c && arr[i] <= d) {
                System.out.println(arr[i]);
            }
        }

    }


}
