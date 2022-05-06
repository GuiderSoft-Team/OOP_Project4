package day045.task2;

public class Main {
    public static void main(String[] args) {
        Musteri m1=new Musteri(11111,"Kayalar İNŞAAT");
        m1.setTel("02125526565");
        m1.seteMail("kayalarinsaat@gmail.com");
        m1.setBorcu(12565);
        m1.tahsilatYap(2565);

        m1.emailGonder("Alacak Tahsili","Gereğinin yapılmasını rica ederiz.");
        System.out.println();

        System.out.println(m1);

    }
}
