package ru.chermashentsev.karate.kicks;

import ru.chermashentsev.karate.KarateFighter;
import ru.chermashentsev.karate.Strike;

public class KickHand implements Strike {
    private static KickHand kick = new KickHand();

    private KickHand() {}

    public static KickHand add() {
        return kick;
    }

    @Override
    public void perform(KarateFighter karateFighter) {
        karateFighter.kickHand();
    }
}
