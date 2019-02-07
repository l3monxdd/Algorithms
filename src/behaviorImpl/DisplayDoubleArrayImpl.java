package behaviorImpl;

import behavior.DisplayDoubleArray;

public class DisplayDoubleArrayImpl implements DisplayDoubleArray {
    @Override
    public void displayArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
