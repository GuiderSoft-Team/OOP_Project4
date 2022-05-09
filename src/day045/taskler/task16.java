package day045.taskler;

import java.util.Random;

public class task16 {
    public static void main(String[] args) {

        System.out.println(generatePassword(6));
    }
    public static String generatePassword(int length){
        String str="";
        Random rnd=new Random();
        for (int i = 0; i <length ; i++) {
            int a= rnd.nextInt(65,122);//AsCII tablosauna göre A.. z arasındaki karakterleri veriyor
            str+=Character.toString(a);

        }

       return str;
    }
}
