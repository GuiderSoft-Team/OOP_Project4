package day045.taskler;

import javax.swing.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

//         getPower();
        System.out.println(usAl(2,3));

    }
    public static void getPower(){
        Scanner input=new Scanner(System.in);
        int temp=1;
        int taban= Integer.parseInt(JOptionPane.showInputDialog("Taban:"));
       int us= Integer.parseInt(JOptionPane.showInputDialog("Us:"));
        for (int i = 0; i <us ; i++) {
            temp*=taban;
        }
        System.out.println("sonuç:"+temp);
    }
    public static int usAl(int taban,int us){
        int temp=1;
        for (int i = 0; i <us ; i++) {
            temp*=taban;
        }
        return temp;
    }
}
