package ru.chermashentsev.karate.kicks;

import ru.chermashentsev.karate.KarateFighter;
import ru.chermashentsev.karate.Strike;

public class KickInJump implements Strike {
    private static KickInJump kick = new KickInJump();
    private KickInJump() {}

    public static KickInJump add() {
        return kick;
    }
    @Override
    public void perform(KarateFighter karateFighter) {
        karateFighter.kickInJump();
    }
}
