package day045.taskler;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        System.out.println(getEvenNumbers(2,50));

    }
    public static ArrayList<Integer> getEvenNumbers(int start, int end){


        ArrayList<Integer>array=new ArrayList<>();

        for (int i = start; i <=end ; i++) {
            if (i%2==0){
                array.add(i);
            }

        }
        return array;

    }
}
