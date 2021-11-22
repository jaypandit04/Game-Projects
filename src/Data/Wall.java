package Data;

import javax.swing.*;
import java.awt.*;

public class Wall {
    private int pointX;
    private int pointY;
    private int width;
    private int height;

    public Wall(int x, int y, int width, int height){
        // TODO: Save the constructor parameters into class fields
        this.pointX=x;
        this.pointY=y;
        this.width = width;
        this.height = height;
    }

    public void drawRectangle(Graphics g){
        g.drawRect(this.pointX,this.pointY,this.width,this.height);
        g.setColor(Color.white);
    }


    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
