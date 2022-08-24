package org.codecademy;

public class Entity {
    String name;
    int health;
    int attack;

    Weapon weapon;

    public Entity(String name, int health, int attack, Weapon weapon){
        this.name=name;
        this.health=health;
        this.attack=attack;
        this.weapon=weapon;
    }

    public int dealDamage(Weapon weapon){
        return attack + weapon.damage;
    }

    public void takeDamage(int damage){
       health -= damage;
    }


}
