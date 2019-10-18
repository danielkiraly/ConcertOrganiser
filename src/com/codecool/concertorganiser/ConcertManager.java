package com.codecool.concertorganiser;

import com.codecool.concertorganiser.band.WarmUpBand;

import java.util.List;

public interface ConcertManager {

    void setRaining();


    List<WarmUpBand> getWarmUpBands();
}
