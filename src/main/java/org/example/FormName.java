package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    FormName formName;

    FormName() {
        super("Gruppuppgift Snake");
        formName = this;
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        highScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HighScore highScore = new HighScore(formName);
                setVisible(false);
                highScore.setVisible(true);
                highScore.setSize(500, 500);
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameSnake game = new GameSnake();
                setVisible(false);
                game.setVisible(true);
                game.setSize(500, 500);
            }
        });
        settingsMapChoiceButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Settings settings = new Settings(formName);
                setVisible(false);
                settings.setVisible(true);
                settings.setSize(500, 500);
            }
        });
    }
}
