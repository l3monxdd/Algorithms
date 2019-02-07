package exercise;

import behavior.DisplayArray;
import behavior.RandomArray;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex16 {
    //16. В одномерном массиве размещены: в первых элементах значения аргумента,
    // в следующих – соответствующие им значения функции. 
    // Напечатать элементы этого массива в n параллельных столбцов (аргумент и значения функции).


    private RandomArray randomArray = new RandomArrayImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();


    public int[] getArr(int size){
        return randomArray.randomArray(size);
    }

    public void showArr(int [] arr){
        displayArray.displayArray(arr);
    }

    public void printSequencesOfTwoArrayElements(int[] arr, int maxColumns) {
        System.out.println();
        int column = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arr.length;) {
            stringBuilder.append("(").append(arr[i++]).append(",").append(arr[i++]).append(")");
            if(column == maxColumns) {
                stringBuilder.append("\n");
                column = 0;
            } else {
                stringBuilder.append("\t");
            }
            column++;
        }
        System.out.println(stringBuilder.toString());
    }

    public void doConditional(int[] arr, int maxColumns){
        if (arr.length %2 != 0){
            throw new IllegalArgumentException("wrong arr length");
        }

            System.out.println();
            int column = 1;
            for (int i = 0; i < arr.length-1; i++) {
                if(column == maxColumns){
                    System.out.print("("+arr[i]+","+arr[i+1]+")"+"\n");
                    column = 0;
                    i++;
                }else {
                    System.out.print("("+arr[i]+","+arr[i+1]+")"+"\t");
                    i++;
                }
                column++;

            }

    }
}
