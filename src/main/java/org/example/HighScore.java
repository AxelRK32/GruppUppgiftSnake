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

    FormName formName;

    HighScore(FormName formName) {
        super("Gruppuppgift Snake");
        this.formName = formName;
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormName form = formName;
                form.setVisible(true);
                dispose();
            }
        });
    }
}
