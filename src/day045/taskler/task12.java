package day045.taskler;

public class task12 {
    public static void main(String[] args) {
        System.out.println(signumFunc(55));
    }
    public static int signumFunc(int value){
        return value>0?1:value==0?0:-1;
    }
}
