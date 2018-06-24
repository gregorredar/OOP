package com.infoshare;

public class Pies extends Zwierze {
    private String rasa;
    private String imie;
    private Integer waga;
    private Double wzrost;

    public Double getWzrost() {
        return wzrost;
    }

    public void setWzrost(Double wzrost) {
        this.wzrost = wzrost;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Integer getWaga() {
        return waga;
    }

    public void setWaga(Integer waga) {
        this.waga = waga;
    }


    public Pies(String rasa, String imie, Integer waga, Double wzrost) {
        this.rasa = rasa;
        this.imie = imie;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public Pies(String rasa, String imie, Integer waga) {
        this(rasa, imie, waga, 0.00);
    }

    public Pies() {
        this("Jamnik", "szarik", 100, 1.80);

    }

    public String szczekaj() {
        return rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " m zrobił chał hał hau.";
    }

    public Double getBmi() {
        return waga / (wzrost * wzrost);
    }

    public String kupa(){
        return getImie() + " zrobił kupkę";
    }

}
