package day045.taskler;

import java.util.Arrays;
import java.util.Random;

public class task17 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateInteger(6)));
    }
    public static int[] generateInteger(int quantity){
        Random rnd=new Random();
        int[]array=new int[quantity];

        for (int i = 0; i <quantity ; i++) {
            int a=rnd.nextInt(100);
            array[i]=a;
        }
        return array;
    }
}
