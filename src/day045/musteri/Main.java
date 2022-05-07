package day045.musteri;

public class Main {
    public static void main(String[] args) {

        Musteri m1=new Musteri("555","Ahmet Dursun");
        m1.setEmail(m1.getAdi().toLowerCase().replace(" ","")+"@mail.com");
        m1.setBorcu(1000);
        m1.tahsilatYap(100);
        m1.emailGonder("Alacaklar", "Geçen ay ödenmesi gereken %5.2f TL henüz ödenmemiştir.");




    }
}
