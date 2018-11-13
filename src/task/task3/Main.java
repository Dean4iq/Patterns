package task.task3;

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.setState(new LandState());
        fighter.getState();

        fighter.selectWeapon(Weapon.NAPALM);
        fighter.setEmpty(false);
        fighter.shoot();

        fighter.nextState(new AirState());
        fighter.selectWeapon(Weapon.BOMB);
        fighter.setEmpty(false);
        fighter.getState();
        fighter.shoot();

        fighter.setEmpty(true);
        fighter.shoot();
    }
}
