package pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
}
