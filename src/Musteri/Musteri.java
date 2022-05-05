package Musteri;


    public class Musteri {
        private int no;
        private String adi;
        private String tel;
        private String eMail;
        private double borcu;

        public Musteri() {
        }

        public Musteri(int no, String adi) {
            this.no = no;
            this.adi = adi;
        }
        public void tahsilatYap(double miktar){
            borcu-=miktar;
        }
        public void eMailGonder(String konu,String mesaj){
            mesaj = "Borcunuzu ödediyseniz bu mesajı dikkate almayınız.";
            System.out.println("kimden: info@sirketim.com\n"+
                    "kime: "+eMail+
                    "\nkonu: "+konu+
                    "\nsayın: "+adi+
                    "\nGeçen ay ödenmesi gereken " +borcu+ " TL henüz ödenmemiştir.\n"+
                    mesaj
            );
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
            return String.format("%s %s %s %s %5.2f",no,adi,tel,eMail,borcu);

        }
    }


