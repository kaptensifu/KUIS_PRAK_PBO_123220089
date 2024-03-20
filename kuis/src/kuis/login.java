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

public class login extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JTextField hasilLabel;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public login() {
        // MeMASUKKAN TABEL DI FRAME SETA INPUTAN
        JLabel usernameLabel = new JLabel("Masukkan Username:");
        JLabel passwordLabel = new JLabel("Masukkan Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        hasilLabel = new JTextField(" ");
        hasilLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Memasukkan tombol
        loginButton = new JButton("Masuk");
        cancelButton = new JButton("batal");

        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        GridLayout layout = new GridLayout(4, 2);
        JPanel panel = new JPanel(layout);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);
        panel.add(hasilLabel);

        
        add(panel);

        //Frame properti
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            //cek username and password
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if ("tukang_089".equals(username) && password.equals("tukang_089")) {
                hasilLabel.setText("Benar");
                
            } else {
                hasilLabel.setText("Username atau Password salah");
            }
            //menutup frame
        } else if (e.getSource() == cancelButton) {
            dispose(); 
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login().setVisible(true));
    }
}