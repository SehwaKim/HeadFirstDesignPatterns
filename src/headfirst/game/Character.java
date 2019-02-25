package headfirst.game;

import headfirst.game.weapon.WeaponBehavior;
import headfirst.game.weapon.impl.KnifeBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public void fight() {
        if (weapon == null) {
            weapon = new KnifeBehavior();
        }
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
