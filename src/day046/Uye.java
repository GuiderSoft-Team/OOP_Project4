package day046;

public class Uye {
    public static final int MAX_VALUE=100;
    private final int SABIT_DEGER=25;
    private int no;
    private String adi;


    public static void birMetot(){

    }
    public Uye(int no, String adi) {
        this.no = no;
        this.adi = adi;
    }

    public Uye() {

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

    public Uye getClone(){
        Uye u=new Uye();
        u.adi=this.adi;
        u.no=this.no;
        return u;
    }

    @Override
    public String toString() {
        return "Uye{" +
                "no=" + no +
                ", adi='" + adi + '\'' +
                '}';
    }
}
