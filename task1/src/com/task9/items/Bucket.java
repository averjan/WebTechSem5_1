package com.task9.items;

import com.task9.color.Color;

import java.util.ArrayList;

public class Bucket {
    private final ArrayList<Ball> balls = new ArrayList<>();

    public void add(Ball ball) {
        this.balls.add(ball);
    }

    public int itemsWeight() {
        return this.balls.stream().mapToInt(o -> o.weight).sum();
    }

    public ArrayList<Ball> filterBallsByColor(Color color) {
        return new ArrayList<Ball>(this.balls
                                        .stream()
                                        .filter(o -> o.color == color)
                                        .toList());
    }
}
