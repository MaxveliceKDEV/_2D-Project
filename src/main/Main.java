package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        GamePanel panel = new GamePanel();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("2D Project");
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        window.add(panel);
        window.pack();

        window.setVisible(true);

        panel.startGameThread();



    }
}