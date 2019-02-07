package behaviorImpl;

import behavior.RandomDoubleArrMinAndMax;

public class RandomDoubleArrMinAndMaxImpl implements RandomDoubleArrMinAndMax {

    @Override
    public double[] randomArray(int size, double min, double max) {
        double [] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            double r = (Math.random() * ( max - min )) + min;

            String s = String.valueOf(r);
            s = s.substring(0,4);

            arr[i]= Double.parseDouble(s);
        }

        return arr;
    }
}
