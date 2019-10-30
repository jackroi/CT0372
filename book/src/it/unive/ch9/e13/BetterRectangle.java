package it.unive.ch9.e13;

import java.awt.*;

public class BetterRectangle  extends Rectangle {
    private static final long serialVersionUID = 1L;

    public BetterRectangle(int x, int y, int width, int height) {
        super.setLocation(x, y);
        super.setSize(width, height);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }

    public double getPerimeter() {
        return super.getHeight()*2 + super.getWidth()*2;
    }
    public static void main(String[] args) {
        BetterRectangle a = new BetterRectangle(10,20, 30, 40);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
    }
}
