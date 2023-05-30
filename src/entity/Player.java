package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler kh;

    public Player(GamePanel gp, KeyHandler kh) {

        this.gp = gp;
        this.kh = kh;

        setDefaultValues();

    }

    private void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 3;
    }

    public void update() {

        if (kh.downPressed) {
           y += speed;
        }
        if (kh.upPressed) {
            y -= speed;
        }
        if (kh.rightPressed) {
            x += speed;
        }
        if (kh.leftPressed) {
            x -= speed;
        }
    }

    public void draw(Graphics2D g2) {

        g2.setColor(Color.WHITE);
        g2.fillRect(x,y, gp.tileSize, gp.tileSize);

    }


}
