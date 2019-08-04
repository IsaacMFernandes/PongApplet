package pong;

import java.applet.Applet;
import java.awt.*;

public class Pong extends Applet implements Runnable {

    final int WIDTH = 700, HEIGHT = 500;
    Thread thread;

    public void init() {
        this.resize(WIDTH, HEIGHT);

        this.addKeyListener(new Controls());

        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }

    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        for(;;) {




            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
