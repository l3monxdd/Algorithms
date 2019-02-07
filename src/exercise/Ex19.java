package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex19 {
    //19. Дан целочисленный массив с количеством элементов n.
    // Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).

    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();


    public void doCondition(int n) {
        int[] arr = randomArray.randomArray(n);
        displayArray.displayArray(arr);
        System.out.println("\n"+"arr[1] = "+arr[1]);
        for (int i = 2; i <arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("i = "+i+" arr[i] = "+arr[i]);
            }
        }

    }

}
