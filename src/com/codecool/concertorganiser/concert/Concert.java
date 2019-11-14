package com.codecool.concertorganiser.concert;

import com.codecool.concertorganiser.band.MainBand;
import com.codecool.concertorganiser.band.MusicStyle;
import com.codecool.concertorganiser.band.WarmUpBand;
import com.codecool.concertorganiser.util.MyRandom;

public class Concert {

    private final int MIN_TICKET_PRICE = 12000;
    private final int MAX_TICKET_PRICE = 15000;

    private ConcertManager concertManager;

    private ConcertType concertType;

    private MainBand mainBand;

    private WarmUpBand warmUpBand;

    private MusicStyle style;

    private int ticketPrice;

    private int visitors;

    public Concert(MainBand mainBand, ConcertType concertType, ConcertManager concertManager){
        this.mainBand = mainBand;
        this.concertType = concertType;
        setVisitors();
        setTicketPrice();
        setStyle();
        setConcertManager(concertManager);
        setWarmUpBand(mainBand);
    }

    private void setWarmUpBand(MainBand mainBand) {
        warmUpBand = mainBand.setWarmUpBand(concertManager.getWarmUpBands());
    }

    private void setStyle() {
        style = mainBand.getStyle();
    }

    private void setVisitors() {
        if(MyRandom.getRandomInRange(0, 100) < 80){
            visitors = concertType.capacity;
        }else{
            visitors = (MyRandom.getRandomInRange(70, 80) / 100) * concertType.capacity;
        }
    }

    private void setTicketPrice() {
        this.ticketPrice = MyRandom.getRandomInRange(MIN_TICKET_PRICE, MAX_TICKET_PRICE);
    }

    private int calculateBeerIncome(){
        return ((concertType.duration / 30) * visitors) * concertType.beerPrice;
    }

    private int calculateTicketIncome(){
        return (int)((visitors * ticketPrice) * 0.4);
    }

    public int calculateIncome(){
        return calculateBeerIncome() + calculateTicketIncome();
    }

    public void setConcertManager(ConcertManager concertManager) {
        this.concertManager = concertManager;
    }
}
