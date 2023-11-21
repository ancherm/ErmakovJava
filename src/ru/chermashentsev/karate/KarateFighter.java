package ru.chermashentsev.karate;

import lombok.Getter;

public class KarateFighter {
    @Getter
    final String name;

    public KarateFighter(String name) {
        this.name = name;
    }

    public void kickLeg() {
        System.out.println(name + ": бац!");
    }
    public void kickHand() {
        System.out.println(name + ": кия!");
    }
    public void kickInJump() {
        System.out.println(name + ": вжух");
    }
}
