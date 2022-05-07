package musteriTakip;

public class MainApp {
    public static void main(String[] args) {

        Musteri musteri=new Musteri(55,"Ahmet");
        musteri.setEmail("ahmet12@gmail.com");
        musteri.setTel("8485948540");
        musteri.setBorcu(25550.85);
        musteri.emailGonder("Alacaklar","Bilgilendirme");


 }
}
