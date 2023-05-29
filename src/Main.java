import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("2D Project");
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        window.add(new GamePanel());
        window.pack();

        window.setVisible(true);

    }
}