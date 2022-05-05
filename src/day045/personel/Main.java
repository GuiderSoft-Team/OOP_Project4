package day045.personel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Personel per1=new Personel();
        String sicilNo=JOptionPane.showInputDialog("Sicil No:");
        per1.setSicilNo(sicilNo);
        per1.setAdi(JOptionPane.showInputDialog("Adı:"));
        per1.setSoyadi(JOptionPane.showInputDialog("Soyadı:"));
        double maas= Double.parseDouble(JOptionPane.showInputDialog("Maaş:"));
        per1.setMaasi(maas);
        per1.maasaZamYap(1500.0);
        per1.maasaZamYap(5);
        System.out.println(per1.getBrutMaas(15));






        System.out.println(per1);

    }


}
