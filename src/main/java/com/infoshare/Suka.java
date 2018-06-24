package com.infoshare;

public class Suka extends Pies {

    public Suka(String rasa, String imie, Integer waga, Double wzrost) {
        super(rasa, imie, waga, wzrost);
    }

    @Override
    public String szczekaj() {
        return "Suka " + getImie() + " rasy " + getRasa() + " o wadze " + getWaga()
                + " kg i wzroście " + getWzrost() + " m zrobiła chał hał hau.";
    }

}
