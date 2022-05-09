package day045.taskler;

public class task9 {
    public static void main(String[] args) {
        String str="Bugün günlerden pazartesidir.";

        System.out.println(makePower(str));
    }
    public static int makePower(String text){
        int chNumberOfText=text.length();
        String[]str=text.split(" ");
        int wordNumberOfText= str.length;

        return (int)Math.pow(chNumberOfText,wordNumberOfText);//math.power double istediği için metodu double a döndürdüm
    }
}
