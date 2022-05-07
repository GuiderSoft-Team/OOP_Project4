package day046;

import javax.swing.*;
import java.awt.*;

public class Pencere extends JFrame {
    private JLabel lblAdi;
    private JLabel lblSelam;
    private JTextField txtAdi;
    private JButton btnSelam;
    private JButton btnMerhaba;

    public Pencere(String title) throws HeadlessException {
        super(title);
        setSize(800,600);
        setLayout(null);
        yapilandir();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    private void yapilandir() {
        //Adı Label
        lblAdi=new JLabel("Adı");
        lblAdi.setSize(40,20);
        lblAdi.setLocation(20,20);
        lblAdi.setForeground(Color.BLUE);
        add(lblAdi);

        //Adı Metin Kutusu
        txtAdi=new JTextField();
        txtAdi.setSize(80,20);
        txtAdi.setLocation(70,20);
        add(txtAdi);

        //Selam Butonu
        btnSelam=new JButton("Selamla");
        btnSelam.setSize(80,20);
        btnSelam.setLocation(70,50);
        btnSelam.addActionListener(e->selamVer());
        add(btnSelam);


        btnMerhaba=new JButton("Merhaba");
        btnMerhaba.setSize(80,20);
        btnMerhaba.setLocation(160,50);
        btnMerhaba.addActionListener(e->merhabaDe());
        add(btnMerhaba);


        //Label Selam
        lblSelam=new JLabel();
        lblSelam.setSize(130,20);
        lblSelam.setLocation(20,80);
        lblSelam.setForeground(Color.RED);
        add(lblSelam);
    }

    private void merhabaDe() {
        JOptionPane.showMessageDialog(this,"Merhaba "+txtAdi.getText());
    }

    private void selamVer() {
        lblSelam.setText("Merhaba "+txtAdi.getText());
    }
}
