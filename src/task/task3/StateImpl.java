package task.task3;

public abstract class StateImpl implements State{
    private Weapon weapon;
    private boolean canShoot;
    private boolean empty;

    @Override
    public void shoot() {
        if (getCanShoot() && !isEmpty() && !getWeapon().name().equals("NONE")) {
            System.out.println("Shooting with " + getWeapon().name());
        } else if (getCanShoot() && !isEmpty() && getWeapon().name().equals("NONE")) {
            System.out.println("No weapon selected");
        } else if (getCanShoot() && isEmpty()) {
            System.out.println("Can't shoot, I'm empty");
        } else if (!getCanShoot()){
            System.out.println("It's forbidden to shoot");
        }
    }

    public boolean getCanShoot() {
        return canShoot;
    }

    public void setCanShoot(boolean canShoot) {
        this.canShoot = canShoot;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
