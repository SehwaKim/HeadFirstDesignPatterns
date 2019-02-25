package headfirst.game.weapon.impl;

import headfirst.game.weapon.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("sword attack");
    }
}
