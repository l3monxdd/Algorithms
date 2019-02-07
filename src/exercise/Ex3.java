package exercise;


import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;
import behaviorImpl.RandomArrayImpl;

public class Ex3 {
    //3. Дана последовательность целых чисел a1, a2, ..., 
    // an. Выяснить, какое число встречается раньше – положительное или отрицательное.


    private RandomArrayImpl randomArray;
    private DisplayArray displayArray;


    public int[] getArrayWithMinAndMax(int size, int min, int max){
        RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
        return randArrMinAndMax.randArray(size,min,max);
    }

    public void verifyArray(int[] arr){
        int countNegative = 0;
        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >0){
                countPositive++;
            }else countNegative++;
        }
        System.out.println("negative value "+countNegative);
        System.out.println("positive value "+countPositive);
        if(countNegative > countPositive){
            System.out.println(" negative value is more common");
        }else if(countNegative < countPositive){
            System.out.println(" positive value is more common");
        }else System.out.println("they are equal");
    }





    public int [] getArray (int size){
        randomArray = new RandomArrayImpl();
        return randomArray.randomArray(size);
    }

    public void showArray(int[] arr){
        displayArray = new DisplayArrayImpl();
        displayArray.displayArray(arr);
    }




}
