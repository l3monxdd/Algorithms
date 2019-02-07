package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex13 {
    //13. В заданном одномерном массиве поменять местами соседние элементы,
    // стоящие на четных местах, с элементами, стоящими на нечетных.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public int[] getArr(int size, int max, int min){
        return randArrMinAndMax.randArray(size, min, max);
    }

    public void showArr(int[] arr){
        displayArray.displayArray(arr);
    }

    // 2 3 6 0
    //0 1 2 3
    public void doConditional(int[] arr){
        System.out.println();
        int j = 0;
        int k = 0;
        int temp;

        for (int i = 0; i < arr.length-1; i=i+2) {
//            if(i%2 == 0){
//                j = arr[i];
//                k = arr[i+1];
//                arr[i]= k;
//                arr[i+1]=j;
//            }

            // приклад роми
            temp = arr[i]; // створюємо тимчасову змінну і присвоюємо 0 елемент колекції
            arr[i] = arr[i+1]; // 0 елементу колекції присвоюємо 1 елемент колекції
            arr[i+1]=temp; // 1 елементу колекції присвоюємо тимчасову змінну в якій записаний 0 елемент колекції
            // і так далі з кромо в i=i+2

//            if(i%2 == 0){
//                arr[i]= arr[i+1];// так неправильно тому що ми нашому масиву arr[i] записали значення
//                //наступного елемента  arr[i+1](якщо б масив мав вигляд 7 2 6 0 то ми б замість 7
//                // написалиб 2
//                arr[i+1]=arr[i]; // наступним кроком ми б скопіювали 2 яка була присвоєна 1 елементу,
//                // та присвоїли б цю саму двійку 2 елементу тобто масив на даному етапі виглядав би
//                // 2 2 6 0  і так далі
//            }
        }

        displayArray.displayArray(arr);
    }





}
