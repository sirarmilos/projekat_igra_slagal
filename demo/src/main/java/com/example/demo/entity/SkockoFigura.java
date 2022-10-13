package com.example.demo.entity;

import java.io.Serializable;

public class SkockoFigura implements Serializable {

    public enum TipFigure {
        Skocko,
        Tref,
        Pik,
        Karo,
        Herc,
        Zvezda
    }

    public enum StanjeFigure {
        Nepoznato,
        Tacno,
        Netacno
    }

    private TipFigure tipFigure;

    private StanjeFigure stanjeFigure;

    private Integer pozicija;

}
