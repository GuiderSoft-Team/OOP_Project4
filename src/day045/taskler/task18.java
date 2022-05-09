package day045.taskler;

import java.util.Arrays;
import java.util.Random;

public class task18 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateInteger(3,30,5)));
    }
    public static int[] generateInteger(int start, int end,int quantity){
        int[]array=new int[quantity];
        Random rnd=new Random();
        for (int i = 0; i <array.length ; i++) {
            int a=rnd.nextInt(start,end);
            array[i]=a;
        }
        return array;
    }
}
