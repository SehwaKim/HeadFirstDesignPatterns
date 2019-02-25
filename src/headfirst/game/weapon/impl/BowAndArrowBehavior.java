package headfirst.game.weapon.impl;

import headfirst.game.weapon.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shoot an arrow");
    }
}
