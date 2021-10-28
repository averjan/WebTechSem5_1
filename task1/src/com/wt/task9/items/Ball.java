package com.wt.task9.items;

import com.wt.task9.color.Color;

public class Ball {
    private int weight = 1;
    private Color color = Color.WHITE;

    public Ball() {
    }

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
