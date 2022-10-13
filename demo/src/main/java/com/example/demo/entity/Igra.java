package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public abstract class Igra implements Serializable {

    @Id
    private String nazivIgre;

    @Column
    private Integer duzinaTrajanjaIgre;

    @Column
    private Integer ukupanBrojBodova;

    @Column
    private Integer vremeNakonIgre;

    @Column
    private Boolean indikatorZaKrajIgre;

    public Igra() {
    }

    public Igra(String nazivIgre, Integer duzinaTrajanjaIgre, Integer ukupanBrojBodova, Integer vremeNakonIgre, Boolean indikatorZaKrajIgre) {
        this.nazivIgre = nazivIgre;
        this.duzinaTrajanjaIgre = duzinaTrajanjaIgre;
        this.ukupanBrojBodova = ukupanBrojBodova;
        this.vremeNakonIgre = vremeNakonIgre;
        this.indikatorZaKrajIgre = indikatorZaKrajIgre;
    }

    public String getNazivIgre() {
        return nazivIgre;
    }

    public void setNazivIgre(String nazivIgre) {
        this.nazivIgre = nazivIgre;
    }

    public Integer getDuzinaTrajanjaIgre() {
        return duzinaTrajanjaIgre;
    }

    public void setDuzinaTrajanjaIgre(Integer duzinaTrajanjaIgre) {
        this.duzinaTrajanjaIgre = duzinaTrajanjaIgre;
    }

    public Integer getUkupanBrojBodova() {
        return ukupanBrojBodova;
    }

    public void setUkupanBrojBodova(Integer ukupanBrojBodova) {
        this.ukupanBrojBodova = ukupanBrojBodova;
    }

    public Integer getVremeNakonIgre() {
        return vremeNakonIgre;
    }

    public void setVremeNakonIgre(Integer vremeNakonIgre) {
        this.vremeNakonIgre = vremeNakonIgre;
    }

    public Boolean getIndikatorZaKrajIgre() {
        return indikatorZaKrajIgre;
    }

    public void setIndikatorZaKrajIgre(Boolean indikatorZaKrajIgre) {
        this.indikatorZaKrajIgre = indikatorZaKrajIgre;
    }

    @Override
    public String toString() {
        return "Igra{" +
                "nazivIgre='" + nazivIgre + '\'' +
                ", duzinaTrajanjaIgre=" + duzinaTrajanjaIgre +
                ", ukupanBrojBodova=" + ukupanBrojBodova +
                ", vremeNakonIgre=" + vremeNakonIgre +
                ", indikatorZaKrajIgre=" + indikatorZaKrajIgre +
                '}';
    }
}
