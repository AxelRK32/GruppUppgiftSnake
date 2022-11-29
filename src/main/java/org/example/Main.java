package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main (String[] args) {

        FormName menu = new FormName();
        menu.setVisible(true);
        menu.setSize(500,500);
        /*menu.startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameSnake game = new GameSnake();
                menu.setVisible(false);
                game.setVisible(true);
                game.setSize(500, 500);
            }
        });*/

        /*menu.settingsMapChoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Settings settings = new Settings();
                menu.setVisible(false);
                settings.setVisible(true);
                settings.setSize(500, 500);
            }
        });*/

    }
}