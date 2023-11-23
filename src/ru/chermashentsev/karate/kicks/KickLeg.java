package ru.chermashentsev.karate.kicks;

import ru.chermashentsev.karate.KarateFighter;
import ru.chermashentsev.karate.Strike;

public class KickLeg implements Strike {
    private static KickLeg kick = new KickLeg();
    private KickLeg() {}

    public static KickLeg add() {
        return kick;
    }
    @Override
    public void perform(KarateFighter karateFighter) {
        karateFighter.kickLeg();
    }
}
