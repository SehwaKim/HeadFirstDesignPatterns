package headfirst.game;

public class Knight extends Character {
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
