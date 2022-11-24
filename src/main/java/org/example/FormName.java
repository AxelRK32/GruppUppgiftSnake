package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class FormName extends JFrame {
    private JPanel MenuTop;
    private JPanel MenuBottomRight;
    private JPanel MenuTopRight;
    private JPanel MenuLeft;
    public JButton startGameButton;
    public JButton settingsMapChoiceButton;
    private JTextArea Instructions;
    private JPanel PanelName;
    private JButton quitButton;
    public JButton highScoresButton;

    FormName() {
        super("Gruppuppgift Snake");
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
