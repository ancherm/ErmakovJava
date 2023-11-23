package ru.chermashentsev.karate;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    @Setter
    public List<Strike> strikes = new ArrayList<>();

    public void perform(KarateFighter karateFighter) {
        if (strikes == null) return;
        for (Strike strike : strikes) {
            strike.perform(karateFighter);
        }
    }
}
