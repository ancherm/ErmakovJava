package ru.chermashentsev.karate;

public class Kick implements Combo.Strike {
    @Override
    public void perform(KarateFighter karateFighter) {
        karateFighter.kickHand();
    }
}
