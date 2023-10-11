package Part1;

public class Gun {
    private int countAmmo;

    public Gun() {
        this.countAmmo = 5;
    }
    public Gun(int countAmmo) {
        this.countAmmo = countAmmo;
    }

    public void toShoot() {
        if (countAmmo > 0) {
            System.out.println("Бах");
            countAmmo--;
        }
        else System.out.println("Клац");
    }
}
