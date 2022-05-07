package day045.musteri;

public class Musteri {

    private int no;
    private String adi;
    private String tel;
    private String email;
    private double borcu;

    public Musteri() {
    }

    public Musteri(String tel, String adi) {
        this.tel = tel;
        this.adi = adi;
    }

    void tahsilatYap(double miktar){
        this.borcu-=miktar;
    }
    void emailGonder(String konu,String mesaj){

     System.out.printf("Kimden: info@sirketim.com\n" +
             "Kime\t: %s\n" +
             "Konu: %s\n" +
             "Sayın %s,\n"+
             mesaj,
             email,konu,adi,borcu);
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

    @Override
    public String toString() {
       return String.format("%s %s %s %5.2f",adi,tel,email,borcu);
    }
}
