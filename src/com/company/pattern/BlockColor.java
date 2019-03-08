//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.pattern;

import java.awt.Color;

class BlockColor {
    String code;
    Color color;
    Color strokeColor;

    public BlockColor(String identity, Color color, Color strokeColor) {
        this.code = identity;
        this.color = color;
        this.strokeColor = strokeColor;
    }

    protected String getCode() {
        return this.code;
    }

    protected Color getColor() {
        return this.color;
    }

    protected Color getStrokeColor() {
        return this.strokeColor;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BlockColor)) {
            return false;
        } else {
            BlockColor other = (BlockColor)obj;
            return other.code.equals(this.code) && other.color.equals(this.color);
        }
    }
}
