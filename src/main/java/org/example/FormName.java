package org.example;

import javax.swing.*;

public class FormName extends JFrame {
    private JPanel MenuTop;
    private JPanel MenuBottomLeft;
    private JPanel MenuBottomRight;
    private JPanel MenuTopRight;
    private JPanel MenuTopLeft;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextArea Instructions;
    private JPanel PanelName;

    FormName() {
        super("Gruppuppgift Snake");
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
