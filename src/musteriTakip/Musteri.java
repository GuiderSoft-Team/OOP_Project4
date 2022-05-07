package musteriTakip;

public class Musteri {
    private int no;
    private String adi;
    private String tel;
    private String email;
    private double borcu;

    public Musteri() {
    }

    public Musteri(int no, String adi) {
        this.no = no;
        this.adi = adi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBorcu() {
        return borcu;
    }

    public void setBorcu(double borcu) {
        this.borcu = borcu;
    }

    public void tahsilatYap(double miktar) {
        this.borcu -= miktar;
    }

    public void emailGonder(String konu, String mesaj) {
        System.out.println("Kimden : aka@bigboss.com\n" +
                "Kime  : " +email + "\n" +
                "\nKonu : " + ("Alacaklar") + "\n" +
                "\nSayın " + adi + ",");
        System.out.println(mesaj = "\nGeçen ay ödenmesi gereken " + borcu + " TL henüz ödenmemiştir.");

    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %s %5.2f", no, adi, tel, email, borcu);
    }
}
