/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MenuLogin extends JFrame implements ActionListener {

    private JButton btn, btnBack;
    private JPanel panel;
    private JLabel idLabel, passLabel;
    private JTextField id, pass;

    public MenuLogin() {

        idLabel = new JLabel();
        idLabel.setText("i");
        id = new JTextField(15);
        passLabel = new JLabel();
        passLabel.setText("Password");
        pass = new JPasswordField(15);
        btn = new JButton("SUBMIT");
        btnBack = new JButton("Back");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(idLabel);
        panel.add(id);
        panel.add(passLabel);
        panel.add(pass);
        panel.add(btn);
        add(panel, BorderLayout.CENTER);
        btn.addActionListener(this);
        setTitle("LOGIN FORM");
        setBounds(200, 10, 250, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = id.getText();
        String passValue = pass.getText();
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {

        } else {

        }
    }
}
