package day045.taskler;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        String str = "Bir berber bir berbere gel beraber bir berber dükkanı açalım demiş";
        System.out.println(shuffleWords(str));

    }

    public static String shuffleWords(String text) {
        String[] str = text.split(" ");
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> secilenler = new ArrayList<>();
        String str1 = "";
        Random rastgele = new Random();

        for (int i = 0; i < str.length; i++) {
            int kura = rastgele.nextInt(list1.size());
            secilenler.add(list1.get(kura));
            list1.remove(kura);

        }
        for (int i = 0; i < secilenler.size(); i++) {
            str1 += secilenler.get(i)+" ";
        }

        return str1;
    }
}

