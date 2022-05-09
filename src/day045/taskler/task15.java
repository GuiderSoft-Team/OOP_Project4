package day045.taskler;

import java.util.Arrays;

public class task15 {
    public static void main(String[] args) {
       int[]array={1,2,3,4,5};
        System.out.println(Arrays.toString(takeSquare(array)));
    }
    public static int[] takeSquare(int[] values){
        int[]kareDizisi=new int[values.length];

        for (int i = 0; i < values.length ; i++) {
            kareDizisi[i]=(int)Math.pow(values[i],2 );
        }
        return kareDizisi;
    }
}
