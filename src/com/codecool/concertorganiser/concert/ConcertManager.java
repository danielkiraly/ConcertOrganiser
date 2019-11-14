package com.codecool.concertorganiser.concert;

import com.codecool.concertorganiser.band.WarmUpBand;

import java.util.List;

public interface ConcertManager {

    void setRaining();

    List<WarmUpBand> getWarmUpBands();
}
