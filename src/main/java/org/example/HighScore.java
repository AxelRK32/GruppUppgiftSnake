package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighScore extends JFrame {

    private JPanel PanelName;
    private JButton backToMenuButton;
    private JLabel HighscoreLabel;
    private JLabel Score1;
    private JLabel Score2;
    private JLabel Score3;

    HighScore() {
        super("Gruppuppgift Snake");
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormName menu = new FormName();
                setVisible(false);
                menu.setVisible(true);
                menu.setSize(500, 500);
            }
        });
    }
}
