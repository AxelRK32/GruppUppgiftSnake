package org.example;

import javax.swing.*;

public class GameSnake extends JFrame {

    private JPanel GameArea;

    GameSnake (){
        super("Snake");
        this.setContentPane(this.GameArea);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
