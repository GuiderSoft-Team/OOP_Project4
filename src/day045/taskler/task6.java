package day045.taskler;

public class task6 {
    public static void main(String[] args) {

        boolean [] array={true,true,false,false,false,true,true};

        System.out.println("Arrayde "+countTrueValues(array)+" adet true değeri var");
    }

    public static int countTrueValues(boolean[] values){

        int count=0;
        for (int i = 0; i <values.length ; i++) {
            if(values[i]==true){
                count++;
            }
        }
     return count;
    }
}
