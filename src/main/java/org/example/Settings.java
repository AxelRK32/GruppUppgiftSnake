package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

public class Settings extends JFrame {
    private JPanel settings;
    public JButton BackToMenu;

    private JLabel chooseStartLength;
    private int lengthOptions[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private ItemListener itemListener;
    private JComboBox StartingLength = new JComboBox();
    FormName formName;
    Container container;

    Settings(FormName formName){
        super("Settings");
        this.formName = formName;
        this.setContentPane(this.settings);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        StartingLength.addItemListener(itemListener);
        StartingLength.addItem(lengthOptions);


        BackToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormName form = formName;
                form.setVisible(true);
                dispose();
            }
        });

        StartingLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = (Integer) StartingLength.getItemAt(StartingLength.getSelectedIndex());
                container.setStartingLength(selected);
            }
        });
    }
}
