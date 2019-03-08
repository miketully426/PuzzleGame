//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.pattern;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class GameArea extends JPanel {
    String title;
    Block[] blocks;

    public GameArea(String title) {
        this.title = title;
    }

    public void setSequence(String sequence) {
        this.blocks = new Block[sequence.length()];

        for(int i = 0; i < sequence.length(); ++i) {
            String code = sequence.substring(i, i + 1);
            this.blocks[i] = Block.getByCode(code);
        }

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Font titleFont = new Font("Helvetica", 1, 24);
        Rectangle2D textRect = titleFont.getStringBounds(this.title, g2.getFontRenderContext());
        int x = 10;
        int y = (int)textRect.getHeight() + 10;

        for(int i = 0; i < this.blocks.length; ++i) {
            this.blocks[i].draw(x, y, g2);
            x += Block.getSpacing() + Block.getSize();
            if (x > this.getWidth() - Block.getSize() - 5) {
                x = 10;
                y += Block.getSize() + Block.getSpacing();
            }
        }

        g2.setFont(titleFont);
        g2.setColor(Color.BLACK);
        g2.drawString(this.title, 10, (int)textRect.getHeight());
    }
}
