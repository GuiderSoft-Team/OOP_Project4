package day045.task2;

public class Musteri {
    private int no;
    private String adi;
    private String tel;
    private String eMail;
    private double borcu;

    public Musteri(int no, String adi) {
        this.no = no;
        this.adi = adi;
    }

    public Musteri() {
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public double getBorcu() {
        return borcu;
    }

    public void setBorcu(double borcu) {
        this.borcu = borcu;
    }

    @Override
    public String toString() {
        return String.format("Müşterinin;\nNo:%d\nAdı:%s\nTel:%s\nEmail:%s\nBorcu:%5.2f",no,adi,tel,eMail,borcu);
    }

    public void tahsilatYap(double miktar){

        this.borcu-=miktar;
    }
    public void emailGonder(String konu,String mesaj){
        System.out.println("Kimden:info@sirketim.com");
        System.out.println("Kime: "+this.eMail);
        System.out.println("Konu: "+konu);
        System.out.println("Sayın: "+this.adi);
        System.out.println("Geçen ay ödenmesi gereken "+this.borcu+" TL henüz ödenmemiştir.");
        System.out.println("Mesaj: "+mesaj);
    }
}
