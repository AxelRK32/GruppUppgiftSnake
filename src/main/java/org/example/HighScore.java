package org.example;

import javax.swing.*;

public class HighScore extends JFrame {

    private JPanel highScore;

    HighScore(){
        super("HighScore");
        this.setContentPane(this.highScore);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
