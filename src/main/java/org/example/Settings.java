package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame{
    private JPanel settings;
    public JButton BackToMenu;

    FormName formName;

    Settings(FormName formName){
        super("Settings");
        this.formName = formName;
        this.setContentPane(this.settings);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        BackToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormName form = formName;
                form.setVisible(true);
                dispose();
            }
        });
    }
}
