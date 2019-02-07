package exercise;

import behavior.DisplayDoubleArray;
import behavior.RandomDoubleArrMinAndMax;
import behaviorImpl.DisplayDoubleArrayImpl;
import behaviorImpl.RandomDoubleArrMinAndMaxImpl;

public class Ex18 {
    //18. У вас есть доллары. Вы хотите обменять их на рубли.
    // Есть информация о стоимости купли-продажи в банках города.
    // В городе N банков. Составьте программу, определяющую, какой банк выбрать,
    // чтобы выгодно обменять доллары на рубли.

    private RandomDoubleArrMinAndMax randomDoubleArrMinAndMax = new RandomDoubleArrMinAndMaxImpl();
    private DisplayDoubleArray displayDoubleArray = new DisplayDoubleArrayImpl();

    public double [] getArr(int size, double min, double max){
       return randomDoubleArrMinAndMax.randomArray(size, max, min);
    }

    public void showArr(double [] arr){
        displayDoubleArray.displayArr(arr);
    }



    public void doCondition(int dolars, int n){
        double [] arr = randomDoubleArrMinAndMax.randomArray(n,27.65,27.85);
        double max = 0;
        int bankNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*dolars;
            if(arr[i]>max){
                max= arr[i];
                bankNumber = i;
            }

        }
        displayDoubleArray.displayArr(arr);

        System.out.println("\n"+"за "+dolars+" доларів макимално можна отримати "+max+"\n"+"в банку за індексом "+bankNumber);


    }
}
