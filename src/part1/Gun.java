package part1;

public class Gun extends Weapon{
//    private int currentCountAmmo;
    private final int maxCountAmmo;

    public Gun(int maxCountAmmo) {
        this(5, maxCountAmmo);
    }
    public Gun(int countAmmo, int maxCountAmmo) {
//        if (maxCountAmmo < 0 || countAmmo < 0) {
//            throw new IllegalArgumentException("Не может быть отрицательное количество патронов");
//        }
        super(countAmmo);
        this.maxCountAmmo = maxCountAmmo;
    }

//    public int getCurrentCountAmmo() {
//        return currentCountAmmo;
//    }

    public int getMaxCountAmmo() {
        return maxCountAmmo;
    }

    public void shoot() {
        if (super.ammo() > 0) {
            System.out.println("Бах");
            setAmmo(super.ammo() - 1);
        }
        else System.out.println("Клац");
    }

    public void reload(int countReloadAmmo) {
        if (countReloadAmmo < 0) {
            throw new IllegalArgumentException("Отрицательное количество патронов");
        }
        else if (countReloadAmmo > maxCountAmmo) {
            countReloadAmmo = maxCountAmmo;
        }
        setAmmo(countReloadAmmo);
    }
    public int unload() {
        int countAmmoBeforeUnload = super.ammo();
        setAmmo(0);

        return countAmmoBeforeUnload;
    }

    public String conditionOfGun() {
        if (super.ammo() > 0)   return "Пистолет заряжен, количество патронов: " + super.ammo();
        return "Пистолет разряжен";
    }
}
