package ru.chermashentsev.karate;

import lombok.Setter;

import java.util.List;

public class Combo {
    @Setter
    List<Strike> strikes;

    public void perform(KarateFighter karateFighter) {
        if (strikes == null) return;
        for (Strike strike : strikes) {
            strike.perform(karateFighter);
        }
    }



    public interface Strike {
        void perform(KarateFighter karateFighter);
    }
}
