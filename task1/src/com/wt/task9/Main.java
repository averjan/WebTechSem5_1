package com.wt.task9;

import com.wt.task9.color.Color;
import com.wt.task9.items.Ball;
import com.wt.task9.items.Bucket;

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

// javac -d src/com/wt/task10 -sourcepath src src/com/wt/task9/Main.java
// java java -cp src/com/wt/task10/ com.wt.task9.Main

// cd src/com/wt/task10
// jar cfe ../task11/a.jar com.wt.task9.Main .
// java -jar ../task11/a.jar