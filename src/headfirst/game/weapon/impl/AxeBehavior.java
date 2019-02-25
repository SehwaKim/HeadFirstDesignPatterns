package headfirst.game.weapon.impl;

import headfirst.game.weapon.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("slaying with an axe");
    }
}
