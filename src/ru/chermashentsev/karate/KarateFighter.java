package ru.chermashentsev.karate;


public class KarateFighter {
    final String name;
    EBelt belt;

    public KarateFighter(String name, EBelt belt) {
        this.name = name;
        this.belt = belt;
    }

    public EBelt getBelt() {
        return belt;
    }

    public void setBelt(EBelt belt) {
        this.belt = belt;
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

    @Override
    public  String toString() {
        return name + " " ;
    }
}
