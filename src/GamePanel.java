import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setFocusable(true);
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    //Window Size Configuration
    final int originalTileSize = 16;
    final int scale = 3;

    final int tileSize = originalTileSize * scale;

    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    //Players default values
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    //FPS
    int FPS = 60;

    Thread gameThread;

    @Override
    public void run() {

        if (gameThread != null) {
            update();

            repaint();
        }
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.WHITE);
        g2.fillRect(100,100, tileSize, tileSize);

        g2.dispose();
    }
}
