package ru.chermashentsev.karate;


import java.util.ArrayList;
import java.util.List;

public class Combo {
    public List<Strike> strikes = new ArrayList<>();

    public void perform(KarateFighter karateFighter) {
        if (strikes == null) return;
        for (Strike strike : strikes) {
            strike.perform(karateFighter);
        }
    }
}
