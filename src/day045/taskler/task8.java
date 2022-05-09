package day045.taskler;

import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {
        String str="Bugün günlerden pazartesidir";
        System.out.println(convertStringToChars(str));
    }
    public static ArrayList<Character>convertStringToChars(String text){
        ArrayList<Character>list=new ArrayList<>();
        for (int i = 0; i < text.length() ; i++) {
            list.add(text.charAt(i));
        }
        return list;
    }
}
