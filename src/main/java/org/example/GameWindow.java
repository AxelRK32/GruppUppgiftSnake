package org.example;
import javax.swing.*;

public class GameWindow extends JFrame {

    private JPanel GameArea;
        public GameWindow() {
            GamePanel gamePanel = new GamePanel();
            add(gamePanel);
            setTitle("November 9 Game");
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLocation(500, 200);
            setLocationRelativeTo(null);
            pack();
        }
    }

