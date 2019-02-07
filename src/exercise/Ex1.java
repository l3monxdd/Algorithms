package exercise;

public class Ex1 {

    public void result (int [] mass,int k){
        int sum  = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] % k == 0){
                sum += mass[i];
                System.out.print(mass[i]+" ");
            }
        }

        System.out.println();
        System.out.println("sum "+sum);
    }


}
