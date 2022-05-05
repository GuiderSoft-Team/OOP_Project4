package day045.personel;

public class Personel {
    private String sicilNo;
    private String adi;
    private String soyadi;
    private double maasi;

    public Personel(String sicilNo, String adi, String soyadi, double maasi) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maasi = maasi;
    }

    public Personel(String sicilNo, String adi, String soyadi) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Personel() {
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }

    public void maasaZamYap(int oran){
        this.maasi+=(this.maasi*oran)/100;
    }

    public void maasaZamYap(double miktar){
        this.maasi+=miktar;
    }

    public double getBrutMaas(int vergiOrani){
        double vergi=maasi*vergiOrani/100;
        return (maasi+vergi)*12;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s (%5.2f)",sicilNo,adi,soyadi,maasi);
    }


}
