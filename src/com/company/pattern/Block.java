//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.pattern;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Float;

public class Block {
    public static BlockColor red = new BlockColor("R", new Color(255, 84, 84), new Color(235, 64, 64));
    public static BlockColor orange = new BlockColor("O", new Color(255, 184, 0), new Color(235, 164, 0));
    public static BlockColor yellow = new BlockColor("Y", new Color(230, 230, 0), new Color(210, 210, 0));
    public static BlockColor green = new BlockColor("G", new Color(71, 184, 71), new Color(51, 164, 51));
    public static BlockColor blue = new BlockColor("B", new Color(102, 184, 255), new Color(82, 164, 235));
    public static BlockColor purple = new BlockColor("P", new Color(204, 153, 255), new Color(184, 133, 235));
    public static BlockColor darkgray;
    BlockColor blockColor;
    RoundRectangle2D shape;
    static Font shapeFont;
    private static int SIZE;
    private static int SPACING;

    static {
        darkgray = new BlockColor("A", Color.GRAY, Color.DARK_GRAY);
        shapeFont = new Font("Helvetica", 1, 20);
        SIZE = 35;
        SPACING = SIZE / 4;
    }

    protected Block(BlockColor blockDefinition) {
        this.blockColor = blockDefinition;
        this.shape = new Float(0.0F, 0.0F, (float)SIZE, (float)SIZE, (float)((int)((double)SIZE * 0.6D)), (float)((int)((double)SIZE * 0.6D)));
    }

    static Block getByCode(String code) {
        if (code.equals("R")) {
            return new Block(red);
        } else if (code.equals("O")) {
            return new Block(orange);
        } else if (code.equals("Y")) {
            return new Block(yellow);
        } else if (code.equals("G")) {
            return new Block(green);
        } else if (code.equals("B")) {
            return new Block(blue);
        } else if (code.equals("P")) {
            return new Block(purple);
        } else {
            return code.equals("A") ? new Block(darkgray) : new Block(darkgray);
        }
    }

    protected static int getSize() {
        return SIZE;
    }

    protected static int getSpacing() {
        return SPACING;
    }

    protected void draw(int x, int y, Graphics2D g2) {
        this.shape.setRoundRect((double)x, (double)y, this.shape.getWidth(), this.shape.getHeight(), this.shape.getArcWidth(), this.shape.getArcHeight());
        g2.setBackground(Color.WHITE);
        g2.setColor(this.blockColor.getStrokeColor());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke solid = new BasicStroke(6.0F, 0, 0, 10.0F, (float[])null, 0.0F);
        g2.setStroke(solid);
        g2.draw(this.shape);
        g2.setColor(this.blockColor.getColor());
        g2.fill(this.shape);
        g2.setColor(Color.BLACK);
        g2.setFont(shapeFont);
        Rectangle2D textRect = shapeFont.getStringBounds(this.blockColor.getCode(), g2.getFontRenderContext());
        g2.drawString(this.blockColor.getCode(), x + (int)((this.shape.getWidth() - textRect.getWidth()) / 2.0D), y + (int)((this.shape.getHeight() + textRect.getHeight() / 2.0D) / 2.0D));
    }
}
