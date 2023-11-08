package ru.chermashentsev.gun;

public class Shooter{
    private String name;
    private Shootable gun;

    public Shooter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getGun() {
        return gun;
    }

    public void setGun(Shootable gun) {
        this.gun = gun;
    }

    public void callShoot() {
        if (gun == null) {
            System.out.println(name + " не могу учавствовать в перестрелке");
        }
        else {
            gun.shoot();
        }
    }
}
