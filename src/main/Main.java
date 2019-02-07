package main;

import behaviorImpl.RandBehaviorImpl;
import behaviorImpl.RandomArrayImpl;
import exercise.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        RandBehaviorImpl randBehavior = new RandBehaviorImpl();
//
////        int k [] =  randBehavior.randArray(5, -10,10);
////        randBehavior.showArray(k);
//
//
//        int z [] = randBehavior.randArray(5,10);
//        randBehavior.showArray(z);
//
//        System.out.println();
//
//        //Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
//        System.out.println("ex1");
//        Ex1 ex1 = new Ex1();
//        ex1.result(z,3);



//        //
//        System.out.println();
//        System.out.println("ex2");
//        Ex2 ex2 = new Ex2();
//        int arr [] = ex2.getArr(30);
//        ex2.displayArr(arr);
//        ex2.doConditional(arr);
//        //




//        System.out.println();
//        //3. Дана последовательность целых чисел a1, a2, ..., 
//        // an. Выяснить, какое число встречается раньше – положительное или отрицательное.
//        System.out.println("ex3");
//        Ex3 ex3 = new Ex3();
//        int [] u = ex3.getArrayWithMinAndMax(5,-7,7);
//        ex3.showArray(u);
//        System.out.println();
//        ex3.verifyArray(u);
//        //

//        //
//        System.out.println();
//        //3. Дана последовательность целых чисел a1, a2, ..., 
//        // an. Выяснить, какое число встречается раньше – положительное или отрицательное.
//        System.out.println("ex4");
//        Ex4 ex4 = new Ex4();
//        int [] ex4Arr = ex4.getArray(3);
//        ex4.displayArray(ex4Arr);
//        ex4.doConditional(ex4Arr);
//        //



//        //
//        System.out.println();
//        //5. Дана последовательность натуральных чисел a1, a2, ..., an.
//        // Создать массив из четных чисел этой последовательности.
//        // Если таких чисел нет, то вывести сообщение об этом факте.
//        System.out.println("ex5");
//        Ex5 ex5 = new Ex5();
//        int [] ex5Arr = ex5.getArray(5);
//        ex5.displayArr(ex5Arr);
//        ex5.doConditional(ex5Arr);
//        //



//        //
//        System.out.println();
//        //6. Дана последовательность чисел a1, a2, ..., an.
//        // Указать наименьшую длину числовой оси, содержащую все эти числа.
//        Ex6 ex6 = new Ex6();
//        int [] ex6Arr = ex6.getArray(5,-9,9);
//        ex6.displayArr(ex6Arr);
//        ex6.findNumericAxis(ex6Arr);
//        //



//        //
//        System.out.println();
//        //7. Дана последовательность действительных чисел a1, a2, ..., an.
//        // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
//        Ex7 ex7 = new Ex7();
//        int [] ex7Arr = ex7.getArr(6);
//        ex7.displayArray(ex7Arr);
//        ex7.doConditional(ex7Arr, 4);
//        //




//        //
//        System.out.println();
//        //8. Последовательность действительных чисел оканчивается нулем.
//        // Найти количество членов этой последовательности.
//        Ex8 ex8 = new Ex8();
//        int [] ex8Arr = ex8.getArr(10,-9,9);
//        ex8.displayArray(ex8Arr);
//        ex8.findConsistency(ex8Arr);
//        //



//        //
//        System.out.println();
//        //9. Дан массив действительных чисел, размерность которого N.
//        // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
//        Ex9 ex9 = new Ex9();
//        int [] ex9Arr = ex9.getArray(40, -9,9);
//        ex9.displayArray(ex9Arr);
//        ex9.doCondition(ex9Arr);
//        //



//        //
//        System.out.println();
//        //10. Даны действительные числа a1, a2, …, an.
//        // Поменять местами наибольший и наименьший элементы.
//        Ex10 ex10 = new Ex10();
//        int[] ex10Arr = ex10.getArray(3, -9, 9);
//        ex10.displayArr(ex10Arr);
//        ex10.doCondition(ex10Arr);
//        //



//        //
//        System.out.println();
//        //11. Даны целые числа a1 a2, .... аn.
//        // Вывести на печать только те числа, для которых выполняется условие аi ≤ i.
//        Ex11 ex11 = new Ex11();
//        int [] ex11Arr = ex11.getArray(10);
//        ex11.displayArray(ex11Arr);
//        ex11.displayConditionArray(ex11Arr);
//        //



//        //
//        System.out.println();
//        //12. Даны натуральные числа a1, a2, ..., an.
//        // Указать те, у которых остаток от деления на М равен L (0 ≤ L ≤ М – 1).
//        Ex12 ex12 = new Ex12();
//        int [] ex12Arr = ex12.getArray(5);
//        ex12.displayArray(ex12Arr);
//        ex12.doCondition(ex12Arr, 3);
//        //


//        //
//        //13. В заданном одномерном массиве поменять местами соседние элементы,
//        // стоящие на четных местах, с элементами, стоящими на нечетных.
//        Ex13 ex13 = new Ex13();
//        int [] arr = ex13.getArr(6,9,-9);
//        ex13.showArr(arr);
//        ex13.doConditional(arr);
//        //


//        //
//        //14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене,
//        // ко второму не допускаются. В массиве A[n] записаны оценки экзаменующихся,
//        // полученные на первом экзамене. Подсчитать, сколько человек не допущено ко второму экзамену.
//        Ex14 ex14 = new Ex14();
//        int [] ex14Arr = ex14.getArr(10,1,4);
//        ex14.showArr(ex14Arr);
//        ex14.doConditional(ex14Arr);
//        //



//        //
//        //15. Дана последовательность чисел, среди которых имеется один нуль.
//        // Вывести на печать все числа, включительно до нуля.
//        Ex15 ex15 = new Ex15();
//        int [] arr = ex15.getArr(30,-1,9);
//        ex15.showArr(arr);
//        ex15.doConditional(arr);
//        //



        // неправельна робота метода
        //16. В одномерном массиве размещены: в первых элементах значения аргумента,
        // в следующих – соответствующие им значения функции.
        //  Напечатать элементы этого массива в n параллельных столбцов (аргумент и значения функции).
//        Ex16 ex16 = new Ex16();
//        int [] arr = ex16.getArr(16);
//        ex16.showArr(arr);
////        ex16.printSequencesOfTwoArrayElements(arr,2);
//        ex16.doConditional(arr,2);



        //
        //17. Пригодность детали оценивается по размеру B,
        // который должен соответствовать интервалу (A – δ, A + δ).
        // Определить, имеются ли в партии из N деталей бракованные.
        // Если да, то подсчитать их количество, иначе выдать отрицательный ответ.
//        Ex17 ex17 = new Ex17();
//        ex17.doConditional(5,8);


//        //
//        //18. У вас есть доллары. Вы хотите обменять их на рубли.
//        // Есть информация о стоимости купли-продажи в банках города.
//        // В городе N банков. Составьте программу, определяющую, какой банк выбрать,
//        // чтобы выгодно обменять доллары на рубли.
//        Ex18 ex18 = new Ex18();
////        double [] arr = ex18.getArr(3,8.3,10.7);
////        ex18.showArr(arr);
//        ex18.doCondition(1000,5);


        //
        //19. Дан целочисленный массив с количеством элементов n.
        // Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).
//        Ex19 ex19 = new Ex19();
//        ex19.doCondition(10);



        //
        //20. Дан одномерный массив A[N]. Найти:  mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1).
        Ex20 ex20 = new Ex20();
        ex20.doConditional(8);





    }
}
