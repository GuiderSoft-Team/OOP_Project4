package day045.taskler;

public class task7 {
    public static void main(String[] args) {
        char[]array={'B','u','g','ü','n',' ','p','a','z','a','r','d','ı','r'};
        System.out.println(makeText(array));
    }
    public static String makeText(char[] values){
        String str="";
        for (int i = 0; i < values.length ; i++) {
            str+=values[i];
        }
return str;
    }
}
