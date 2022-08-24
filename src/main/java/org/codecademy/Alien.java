package org.codecademy;

import java.util.Random;

public class Alien extends Entity{

    private final int maxHealth;

    public Alien(String name, int health, int attack, Weapon weapon) {
        super(name, health, attack, weapon);
        this.maxHealth=health;
    }



    @Override
    public int dealDamage(Weapon weapon) {
        if(invisibility()){
            return 2 * attack + weapon.damage;
        }else {
            return super.dealDamage(weapon);
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }

    public void selfHealing(){
        health = maxHealth;
    }

    public boolean invisibility(){
         Random random = new Random();
        return random.nextBoolean();
    }
}
