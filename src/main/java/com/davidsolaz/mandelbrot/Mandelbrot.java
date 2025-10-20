package com.davidsolaz.mandelbrot;

import javax.swing.*;
import java.awt.*;

public class Mandelbrot extends JPanel {
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private final int MAX_ITER = 1000;

    public Mandelbrot() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                double zx = 0;
                double zy = 0;
                double cX = (x - WIDTH/2.0) * 4.0/WIDTH;
                double cY = (y - HEIGHT/2.0) * 4.0/HEIGHT;
                int iter = 0;
                while (zx*zx + zy*zy < 4 && iter < MAX_ITER) {
                    double tmp = zx*zx - zy*zy + cX;
                    zy = 2.0*zx*zy + cY;
                    zx = tmp;
                    iter++;
                }
                int color = iter | (iter << 8);
                g.setColor(new Color(color));
                g.drawRect(x, y, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mandelbrot Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Mandelbrot());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}