package org.example;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyboard extends KeyAdapter {
    public boolean goLeft = false;
    public boolean goUp = false;
    public boolean goRight = false;
    public boolean goDown = false;
    public boolean spacePressed = false;
    public boolean shootBullet = false;
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE &&  !spacePressed) {
            spacePressed = true;
            shootBullet = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            goLeft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            goRight = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            goUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            goDown = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            spacePressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            goLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            goRight = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            goUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            goDown = false;
        }
    }
}
