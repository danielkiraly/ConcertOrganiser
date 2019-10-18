package com.codecool.concertorganiser.concert;

import com.codecool.concertorganiser.ConcertManager;
import com.codecool.concertorganiser.band.MainBand;
import com.codecool.concertorganiser.band.WarmUpBand;
import com.codecool.concertorganiser.util.MyRandom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConcertOrganiser implements ConcertManager {

    private List<Concert> concerts = new ArrayList<>();

    private List<Concert> outdoorConcerts = new ArrayList<>();

    private List<MainBand> mainBands = new ArrayList<>();

    private List<WarmUpBand> warmUpBands = new LinkedList<>();

    private boolean isRaining;

    private ConcertManager concertManager;

    public void addConcert(Concert concert){
        concert.setConcertManager(this);
        concerts.add(concert);
    }

    public void addOutdoorConcert(Concert concert){
        concert.setConcertManager(this);

        outdoorConcerts.add(concert);
    }

    public void addMainBand(MainBand band){
        mainBands.add(band);
    }

    public void addWarmUpBand(WarmUpBand band){
        warmUpBands.add(band);
    }


    public int calculateProfit(){
        int income = 0;

        for (Concert concert : concerts) {
            income += concert.calculateIncome();
        }

        for (Concert concert : outdoorConcerts) {
            income += concert.calculateIncome();
        }

        return income;
    }


    @Override
    public void setRaining() {
       if( MyRandom.getRandomInRange(0, 100) < 30){
           isRaining = true;
       }
       isRaining = false;
    }


    @Override
    public List<WarmUpBand> getWarmUpBands() {

        return warmUpBands;
    }
}
