package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex20 {
    //20. Дан одномерный массив A[N]. Найти:  mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1).

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public void doConditional(int n) {
        int[] arr = randomArray.randomArray(n);
        displayArray.displayArray(arr);
        int max = arr[2];
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] > max) {
                max = arr[i];
            } else if (i % 2 != 0 && arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("\n" + "max = " + max);
        System.out.println("min = " + min);
        System.out.println("condition = "+(max+min));

    }


}
