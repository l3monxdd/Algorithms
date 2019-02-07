package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex2 {

//    В целочисленной последовательности есть нулевые элементы.
// Создать массив из номеров этих элементов.

//    public void result (int k[]){
//        for (int i = 0; i < k.length; i++) {
//            if (k[i] == 0){
//                int random = (int)Math.round(Math.random()*9);
//
//            }
//        }
//
//    }

    public int[] getArr(int size){
        RandomArray array = new RandomArrayImpl();
        return array.randomArray(size);
    }

    public void displayArr(int [] arr){
        DisplayArray displayArray = new DisplayArrayImpl();
        displayArray.displayArray(arr);
    }

    public void doConditional (int[] arr){
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                countZero++;
                System.out.println();
                System.out.println("we have Zero element, new array = ");
                RandomArray array = new RandomArrayImpl();
                DisplayArray displayArray = new DisplayArrayImpl();
                displayArray.displayArray(array.randomArray(3));
            }
        }
        System.out.println("our Zero count = "+countZero);
    }
}
