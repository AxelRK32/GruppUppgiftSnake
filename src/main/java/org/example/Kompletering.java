package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kompletering extends JFrame{
    private JPanel panelName;
    private JTextField nameField;
    private JTextField scoreField;
    private JLabel scoreLabel;
    private JLabel nameLabel;
    private JButton save;
    private JButton menu;
    private JLabel currentName;
    private JLabel currentScore;

    FormName formName;
    Container container = new Container();

    Kompletering(FormName formName){
        super("Kompletering");
        this.formName = formName;
        this.setContentPane(this.panelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormName form = formName;
                form.setVisible(true);
                form.setSize(500,500);
                dispose();
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            formName.container.setProfileName(nameField.getText());
            formName.container.setHighScore(Integer.parseInt(scoreField.getText()));

            container.setHighScore(Integer.parseInt(scoreField.getText()));
            container.setProfileName(nameField.getText());
            currentName.setText(container.getProfileName());
            currentScore.setText(String.valueOf(container.getHighScore()));
            }
        });
    }

}
