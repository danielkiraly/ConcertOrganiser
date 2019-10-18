package com.codecool.concertorganiser.concert;

public enum ConcertType {
    INDOOR(3000, 90, 600),
    OUTDOOR(5000, 120, 800),
    FESTIVAL(8000, 360, 1000);

    int capacity;
    int duration;
    int beerPrice;

    ConcertType(int capacity, int duration, int beerPrice){
        this.capacity = capacity;
        this.duration = duration;
        this.beerPrice = beerPrice;
    }
}
