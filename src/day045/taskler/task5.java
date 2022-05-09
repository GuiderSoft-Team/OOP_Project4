package day045.taskler;

public class task5 {
    public static void main(String[] args) {
        System.out.println(isNumberOutOfRangeFiftyAndHundred(101));
    }
    public static boolean isNumberOutOfRangeFiftyAndHundred(int number){
        return number<50||number>100;
    }
}
