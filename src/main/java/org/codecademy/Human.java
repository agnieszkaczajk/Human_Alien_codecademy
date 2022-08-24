package org.codecademy;

public class Human extends Entity{
    int armour;
    public Human(String name, int health, int attack, Weapon weapon, int armour) {
        super(name, health, attack, weapon);
        this.armour=armour;
    }

    @Override
    public int dealDamage(Weapon weapon) {
        return super.dealDamage(weapon);
    }

    @Override
    public void takeDamage(int damage) {
        if(damage > armour) {
            health -= damage - armour;
        }

    }

}
