package com.codecool.concertorganiser.band;

public abstract class Band {

    protected String name;

    protected MusicStyle style;

    public Band(String name, MusicStyle style){
        this.name = name;
        this.style = style;
    }

    public MusicStyle getStyle() {
        return style;
    }


}
