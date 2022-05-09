package day045.taskler;

import javax.swing.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("başlangıç sayısını girin: ");
        int a= input.nextInt();
        System.out.print("bitiş sayısını girin: ");
        int b= input.nextInt();
        uceBolunen(a,b);
    }

    public static void uceBolunen(int a,int b){

        for (int i = a; i <=b ; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }

    }
}
