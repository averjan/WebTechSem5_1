package com.task9;

import com.task9.color.Color;
import com.task9.items.Ball;
import com.task9.items.Bucket;

public class Main {

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.add(new Ball(12, Color.RED));
        bucket.add(new Ball(40, Color.BLUE));
        bucket.add(new Ball(2, Color.RED));
        bucket.add(new Ball(1, Color.BLUE));

        System.out.println(bucket.itemsWeight());
        System.out.println(
                (long) bucket.filterBallsByColor(Color.BLUE).size());
    }
}

// javac -d bin -sourcepath src src/com/task9/Main.java

// inside /bin jar cfe a.jar com.task9.Main .
// java -jar a.jar