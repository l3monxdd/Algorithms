package exercise;

import behavior.DisplayArray;
import behavior.RandArrMinAndMax;
import behaviorImpl.DisplayArrayImpl;
import behaviorImpl.RandArrMinAndMaxImpl;

public class Ex17 {
    //17. Пригодность детали оценивается по размеру B,
    // который должен соответствовать интервалу (A – δ, A + δ).
    // Определить, имеются ли в партии из N деталей бракованные.
    // Если да, то подсчитать их количество, иначе выдать отрицательный ответ.

    private RandArrMinAndMax randArrMinAndMax = new RandArrMinAndMaxImpl();
    private DisplayArray displayArray = new DisplayArrayImpl();

    public void  doConditional(int N, int B){
        int min = B-5;
        int max = B+5;
        int δ = 1;
        int countPositive = 0;
        int arr [] = randArrMinAndMax.randArray(N,min,max);
        displayArray.displayArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if((B-δ)<= arr[i] && arr[i] <=(B+δ)){
                countPositive++;
                System.out.println(arr[i]);
            }
        }
        if (countPositive == 0 ){
            System.out.println("всі деталі є браковані");
        }else {
            System.out.println("кількість бракованих деталей = "+(N-countPositive));
        }


    }
}
