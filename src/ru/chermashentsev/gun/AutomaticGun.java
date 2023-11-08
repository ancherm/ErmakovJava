package ru.chermashentsev.gun;

public class AutomaticGun extends Gun implements Shootable {
    private final int rateOfFire;

    public AutomaticGun() {
        this(30, 30);
    }
    public AutomaticGun(int maxCountAmmo) {
        this(maxCountAmmo, maxCountAmmo/2 + 1);
    }
    public AutomaticGun(int maxCountAmmo, int rateOfFire) {
        super(maxCountAmmo);

        if (rateOfFire < 0){
            throw new IllegalArgumentException("Скорострельность не может быть 0 или меньше");
        }
        this.rateOfFire = rateOfFire;
    }

    @Override
    public void shoot() {
        for (int i = 0; i < rateOfFire; i++) {
            super.shoot();
        }
    }

    public void shootPerSecond(int seconds) {
        int countShoots = rateOfFire * seconds;
        for (int i = 0; i < countShoots; i++) {
            super.shoot();
        }
    }
}
