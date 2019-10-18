package com.codecool.concertorganiser.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MyRandom {

    public static int getRandomInRange(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
