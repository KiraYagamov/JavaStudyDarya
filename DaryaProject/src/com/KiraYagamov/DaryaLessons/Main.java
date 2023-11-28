package com.KiraYagamov.DaryaLessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JButton button, button2, button3;
    MyPanel panel;
    Color panelColor = Color.blue;

    boolean isGrad = false;

    int x = 150;
    int y = 150;

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
    public void start(){
        JFrame frame = new JFrame("My new app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click me!");
        button.addActionListener(new Click1());
        button2 = new JButton("Click me2!");
        button2.addActionListener(new Click2());
        button3 = new JButton("Click me3!");
        button3.addActionListener(new Click3());
        panel = new MyPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.getContentPane().add(BorderLayout.WEST, button3);


        frame.getContentPane().add(panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
        while(true) {
            for (int i = 0; i < 120; i++) {
                x++;
                y++;
                panel.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            for (int i = 0; i < 120; i++) {
                x++;
                y--;
                panel.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            for (int i = 0; i < 120; i++) {
                x--;
                y--;
                panel.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            for (int i = 0; i < 120; i++) {
                x--;
                y++;
                panel.repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
    }
    class Click1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            panelColor = Color.GREEN;
            isGrad = false;
            panel.repaint();
        }
    }
    class Click2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            panelColor = Color.BLUE;
            isGrad = false;
            panel.repaint();
        }
    }
    class Click3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            isGrad = true;
            panel.repaint();
        }
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if(!isGrad) {
                g.setColor(panelColor);
                g.fillOval(x, y, 100, 100);
            }
            else{
                Graphics2D g2d = (Graphics2D) g;

                GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 300, 300, Color.RED);

                g2d.setPaint(gradient);
                g2d.fillOval(x, y, 100, 100);
            }
        }
    }
}
