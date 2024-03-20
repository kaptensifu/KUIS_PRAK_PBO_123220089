    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Acer
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


class Hitung extends JFrame 
        implements ActionListener{
    
    // buat variabel
    private JLabel alas;
    private JTextField teks;
    private JLabel tinggi;
    private JTextField teks2;
    private JButton hitung;
    private JTextField hasil;
    
    //Memasukkan dalam frame
    public Hitung(){
        alas= new JLabel("Masukkan alas");
        teks=new JTextField(10);
        tinggi= new JLabel("Masukkan tinggi");
        teks2=new JTextField(10);
        hitung=new JButton("Hitung");
        hasil = new JTextField(" ");
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        ButtonGroup group=new ButtonGroup();
        group.add(hitung);
        hitung.addActionListener(this);
        
        setLayout(null);
        add(alas);
        add(teks);
        add(tinggi);
        add(teks2);
        add(hitung);
        add(hasil);
        
        //mengatur tempat variabel
        alas.setBounds(10,10,120,20);
        teks.setBounds(110,10,120,20);
        tinggi.setBounds(10,30,120,20);
        teks2.setBounds(110,30,120,20);
        hitung.setBounds(110,60,120,20);
        hasil.setBounds(110,90,120,20);
             
        //frame properti
        pack();
        setTitle("Hitung Siku");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,200);      
        
        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitung) {
            //cek username and password
                       
            double kalas=Double.parseDouble(teks.getText());
            double ktinggi=Double.parseDouble(teks2.getText());
            double c =Math.sqrt((Math.pow(kalas, 2))+(Math.pow(ktinggi,2)));
            hasil.setText("hasil" + c);
            
    }
    }
}
    
    



//Menjalankan
public class hitungsiku{
    public static void main(String[]args){
        new Hitung();
    }

    static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

