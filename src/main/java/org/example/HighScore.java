package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighScore extends JFrame {

    private JPanel PanelName;
    private JButton backToMenuButton;
    private JLabel HighscoreLabel;
    private JLabel Scorename1;
    private JLabel Scorename2;
    private JLabel Scorename3;
    private JTextField NameTextField;
    private JLabel Score1;
    private JLabel Score2;
    private JLabel Score3;
    private JTextField ScoreTextField;

    FormName formName;
    HighScoreList highScoreList = new HighScoreList();

    public HighScore(FormName formName, HighScoreList highScoreList) {
        super("Gruppuppgift Snake");
        this.highScoreList = highScoreList;
        setup(formName);
    }

    public void setup(FormName formName) {
        this.formName = formName;
        this.setContentPane(this.PanelName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        Scorename1.setText(highScoreList.name1);
        Scorename2.setText(highScoreList.name2);
        Scorename3.setText(highScoreList.name3);
        Score1.setText(String.valueOf(highScoreList.player1Score));
        Score2.setText(String.valueOf(highScoreList.player2Score));
        Score3.setText(String.valueOf(highScoreList.player3Score));
        backToMenuButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*Detta ska egentligen hämta poängen från applesEaten från gamepanel men
                det funkar inte just nu så jag gjorde så att man kan skriva hur mycket poäng man har
                i ScoreTextField*/
                try {
                    String newScoreName = NameTextField.getText();
                    String Score = ScoreTextField.getText();
                        int newScore = Integer.parseInt(Score);
                    if (newScore > highScoreList.player1Score) {
                        highScoreList.setName3(highScoreList.name2);
                        highScoreList.player3Score = highScoreList.player2Score;

                        highScoreList.setName2(highScoreList.name1);
                        highScoreList.player2Score = highScoreList.player1Score;

                        highScoreList.setName1(newScoreName);
                        highScoreList.player1Score = newScore;
                        Score1.setText(String.valueOf(newScore));
                    } else if (newScore > highScoreList.player2Score) {
                        highScoreList.setName3(highScoreList.name2);
                        highScoreList.player3Score = highScoreList.player2Score;

                        highScoreList.setName2(newScoreName);
                        highScoreList.player2Score = newScore;
                        Score2.setText(String.valueOf(newScore));
                    } else if (newScore > highScoreList.player3Score) {
                        highScoreList.setName3(newScoreName);
                        highScoreList.player3Score = newScore;
                        Score3.setText(String.valueOf(newScore));
                    }
                } catch (Exception ignored) {
                }

                FormName form = formName;
                form.setHighScores(highScoreList);
                setVisible(false);
                form.setVisible(true);
            }
        });
    }
}
