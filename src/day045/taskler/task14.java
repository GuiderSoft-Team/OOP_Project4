package day045.taskler;

public class task14 {
    public static void main(String[] args) {
      String str="Bir berber bir berbere gel beraber bir berber dükkanı açalım demiş.";
        System.out.println(reverseCharsOfEachWords(str));
    }
    public static String reverseCharsOfEachWords(String text){

        String str="";
        for (int i = text.length()-1; i>=0 ; i--) {
            str+=text.charAt(i);
        }
        String[]strArray=str.split(" ");
        String str2="";
        for (int i = strArray.length-1 ;i>=0 ; i--) {
            str2+=strArray[i]+" ";
        }
        return str2;
    }
}
