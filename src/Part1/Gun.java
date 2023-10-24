package Part1;

public class Gun {
    private int currentCountAmmo;
    private final int maxCountAmmo;

    public Gun(int maxCountAmmo) {
        this(5, maxCountAmmo);
    }
    public Gun(int countAmmo, int maxCountAmmo) {
        this.currentCountAmmo = countAmmo;
        this.maxCountAmmo = maxCountAmmo;
    }

    public int getCurrentCountAmmo() {
        return currentCountAmmo;
    }

    public int getMaxCountAmmo() {
        return maxCountAmmo;
    }

    public void shoot() {
        if (currentCountAmmo > 0) {
            System.out.println("Бах");
            currentCountAmmo--;
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
        currentCountAmmo = countReloadAmmo;
    }
    public int unload() {
        int countAmmoBeforeUnload = currentCountAmmo;
        currentCountAmmo = 0;

        return countAmmoBeforeUnload;
    }

    public String conditionOfGun() {
        if (currentCountAmmo > 0)   return "Пистолет заряжен, количество патронов: " + currentCountAmmo;
        return "Пистолет разряжен";
    }
}
