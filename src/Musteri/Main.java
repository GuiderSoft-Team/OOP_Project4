package Musteri;

public class Main {
    public static void main(String[] args) {
        Musteri musteri=new Musteri(12,"murat");
        musteri.seteMail("erdal@gmail.com");
        musteri.setTel("434354");
        musteri.setBorcu(1200.0);
        musteri.eMailGonder("alacaklar","borc");

    }
}