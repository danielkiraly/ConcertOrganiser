package com.codecool.concertorganiser.band;

import java.util.List;

public class MainBand extends Band {

    public MainBand(String name, MusicStyle style){
        super(name, style);
    }

    public WarmUpBand setWarmUpBand(List<WarmUpBand> warmUpBands){
        for (WarmUpBand warmUpBand : warmUpBands) {
            if(warmUpBand.getStyle().equals(style)){
                return warmUpBand;
            }
        }
        return null;
    }
}
