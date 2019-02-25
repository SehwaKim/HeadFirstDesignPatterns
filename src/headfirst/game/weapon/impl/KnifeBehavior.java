package headfirst.game.weapon.impl;

import headfirst.game.weapon.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("knife attack");
    }
}
