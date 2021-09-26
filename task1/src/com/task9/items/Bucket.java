package com.task9.items;

import com.task9.color.Color;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private final ArrayList<Ball> balls = new ArrayList<>();

    public void add(Ball ball) {
        this.balls.add(ball);
    }

    public int itemsWeight() {
        return this.balls.stream()
                .mapToInt(b -> b == null ? 0 : b.getWeight())
                .sum();
    }

    public List<Ball> filterBallsByColor(Color color) {
        return new ArrayList<>(this.balls
                                        .stream()
                                        .filter(o -> o.getColor() == color)
                                        .toList());
    }
}
