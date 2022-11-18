/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.io.*;

public class MenuUtama
        extends JFrame implements ActionListener {

    private JButton login = new JButton();
    private JButton reg = new JButton();
    private JButton category = new JButton();
    private Container c;

    public MenuUtama() {
        setBounds(400, 10, 450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        c = getContentPane();
        c.setLayout(null);
        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(100, 60);
        login.setLocation(150, 50);
        login.addActionListener(this);
        c.add(login);
        reg = new JButton("Registrasi");
        reg.setFont(new Font("Arial", Font.PLAIN, 15));
        reg.setSize(100, 60);
        reg.setLocation(150, 150);
        reg.addActionListener(this);
        c.add(reg);
        category = new JButton("Registrasi");
        category.setFont(new Font("Arial", Font.PLAIN, 15));
        category.setSize(100, 60);
        category.setLocation(150, 250);
        category.addActionListener(this);
        c.add(category);
        c.add(login);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            MenuLogin menuLogin = new MenuLogin();
        } else if (e.getSource() == reg) {
            MenuRegistrasi menuReg = new MenuRegistrasi();
        }
    }

}
