/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 * username = 123210058
 * pass = 123210058
 * @author NANANG TRI HANDOYO
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuLogin extends JFrame implements ActionListener {
    private JPanel pnl1, pnl2;
    private JLabel lblLogin, lblPassword, lblStatus;
    private JTextField textLogin;
    private JPasswordField passwordField;
    private JButton btnLogin, btnReset, btnLogout;

    public MenuLogin() {
        setTitle("Halaman Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setSize(300, 180);

        pnl1 = new JPanel();
        pnl1.setLayout(null);
        
        lblLogin = new JLabel("Username:");
        lblLogin.setBounds(10, 20, 90, 25);
        pnl1.add(lblLogin);
        textLogin = new JTextField(20);
        textLogin.setBounds(100, 20, 165, 25);
        pnl1.add(textLogin);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(10, 50, 90, 25);
        pnl1.add(lblPassword);
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        pnl1.add(passwordField);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(40, 100, 90, 25);
        btnLogin.addActionListener(this);
        pnl1.add(btnLogin);
        
        btnReset = new JButton("Reset");
        btnReset.setBounds(170, 100, 90, 25);
        btnReset.addActionListener(this);
        pnl1.add(btnReset);

        lblStatus = new JLabel("");
        lblStatus.setBounds(10, 120, 200, 25);
        pnl1.add(lblStatus);

       
        pnl2 = new JPanel();
        pnl2.setLayout(null);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(100, 90, 90, 25);
        btnLogout.addActionListener(this);
        pnl2.add(btnLogout);

        JLabel labelSuccess = new JLabel("Anda telah login");
        labelSuccess.setBounds(10, 20, 200, 25);
        pnl2.add(labelSuccess);

        getContentPane().add(pnl1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = textLogin.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("123210058") && password.equals("123210058")) {
                getContentPane().removeAll();
                getContentPane().add(pnl2);
                revalidate();
                repaint();
            } else {
                lblStatus.setText("Login gagal masbro");
            }
        } else if (e.getSource() == btnReset) {
            textLogin.setText("");
            passwordField.setText("");
        } else if (e.getSource() == btnLogout) {
            getContentPane().removeAll();
            getContentPane().add(pnl1);
            textLogin.setText("");
            passwordField.setText("");
            lblStatus.setText("");
            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) {
        MenuLogin MenuLogin = new MenuLogin();
    }
}
