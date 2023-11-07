package part1.gun;

public class Gun extends Weapon implements IGun{
    private final int maxCountAmmo;

    public Gun(int maxCountAmmo) {
        this(5, maxCountAmmo);
    }
    public Gun(int countAmmo, int maxCountAmmo) {
        super(countAmmo);
        this.maxCountAmmo = maxCountAmmo;
    }

    public int getMaxCountAmmo() {
        return maxCountAmmo;
    }

    @Override
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
