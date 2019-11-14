package com.codecool.concertorganiser;

import com.codecool.concertorganiser.band.MainBand;
import com.codecool.concertorganiser.band.MusicStyle;
import com.codecool.concertorganiser.band.WarmUpBand;
import com.codecool.concertorganiser.concert.Concert;
import com.codecool.concertorganiser.concert.ConcertOrganiser;
import com.codecool.concertorganiser.concert.ConcertType;

public class Main {

    public static void main(String[] args) {

        ConcertOrganiser concertOrganiser = new ConcertOrganiser();

        MainBand mb = new MainBand("Main", MusicStyle.ROCK);

        concertOrganiser.addMainBand(mb);

        WarmUpBand wb = new WarmUpBand("Warmup", MusicStyle.ROCK);

        concertOrganiser.addWarmUpBand(wb);

        Concert outdoor = new Concert(mb, ConcertType.OUTDOOR, concertOrganiser);

        Concert indoor = new Concert(mb, ConcertType.INDOOR, concertOrganiser);

        Concert festival = new Concert(mb, ConcertType.FESTIVAL, concertOrganiser);

        concertOrganiser.addConcert(indoor);
        concertOrganiser.addConcert(festival);
        concertOrganiser.addOutdoorConcert(outdoor);

        System.out.println(concertOrganiser.calculateProfit());











    }
}
