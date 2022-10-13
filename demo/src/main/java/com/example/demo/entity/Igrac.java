package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Igrac implements Serializable {

    @Id
    private String korisnickoIme;

    @Column
    private String lozinka;

    @Column
    private Integer brojBodova;

    public Igrac() {
    }

    public Igrac(String korisnickoIme, String lozinka, Integer brojBodova) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.brojBodova = brojBodova;
    }

    public Igrac(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Integer getBrojBodova() {
        return brojBodova;
    }

    public void setBrojBodova(Integer brojBodova) {
        this.brojBodova = brojBodova;
    }

    @Override
    public String toString() {
        return "Igrac{" +
                "korisnickoIme='" + korisnickoIme + '\'' +
                ", lozinka='" + lozinka + '\'' +
                ", brojBodova=" + brojBodova +
                '}';
    }
}
