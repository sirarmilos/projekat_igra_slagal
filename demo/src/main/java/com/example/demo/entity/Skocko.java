package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Skocko extends Igra implements Serializable {

    private Integer brojKoraka;

    private List<SkockoFigura> tacnaKombinacija;

    private List<SkockoFigura> gadjanjeKombinacija = new ArrayList<>();

    public Skocko(Integer brojKoraka, List<SkockoFigura> tacnaKombinacija) {
        this.brojKoraka = brojKoraka;
        this.tacnaKombinacija = tacnaKombinacija;
    }

    public Skocko(String nazivIgre, Integer duzinaTrajanjaIgre, Integer ukupanBrojBodova, Integer vremeNakonIgre, Boolean indikatorZaKrajIgre, Integer brojKoraka, List<SkockoFigura> tacnaKombinacija) {
        super(nazivIgre, duzinaTrajanjaIgre, ukupanBrojBodova, vremeNakonIgre, indikatorZaKrajIgre);
        this.brojKoraka = brojKoraka;
        this.tacnaKombinacija = tacnaKombinacija;
    }

    public Integer getBrojKoraka() {
        return brojKoraka;
    }

    public void setBrojKoraka(Integer brojKoraka) {
        this.brojKoraka = brojKoraka;
    }

    public List<SkockoFigura> getTacnaKombinacija() {
        return tacnaKombinacija;
    }

    public void setTacnaKombinacija(List<SkockoFigura> tacnaKombinacija) {
        this.tacnaKombinacija = tacnaKombinacija;
    }

    @Override
    public String toString() {
        return "Skocko{" +
                "brojKoraka=" + brojKoraka +
                ", tacnaKombinacija=" + tacnaKombinacija +
                '}';
    }
}
