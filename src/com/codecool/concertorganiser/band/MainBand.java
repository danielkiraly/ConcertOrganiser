package com.codecool.concertorganiser.band;

import java.util.List;

public class MainBand extends Band {

    public MainBand(MusicStyle style){
        super.style = style;

    }



    public WarmUpBand setWarmUpBand(List<WarmUpBand> warmUpBands){
        for (WarmUpBand warmUpBand : warmUpBands) {
            if(warmUpBand.getStyle().equals(super.style)){
                return warmUpBand;
            }
        }
        return null;
    }
}
