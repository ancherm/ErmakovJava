package part1.gun;

public class Shooter{
    private String name;
    private IGun gun;

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

    public void setGun(IGun gun) {
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
