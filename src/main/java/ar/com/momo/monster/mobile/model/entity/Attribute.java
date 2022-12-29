package ar.com.momo.monster.mobile.model.entity;

import java.io.Serializable;

/**
 * Attributes of a User for battling
 */
public class Attribute implements Serializable {

    private int health;
    private int mana;
    private int attack;
    private int intelligence;
    private int defense;
    private int magicalResistance;
    private int speed;
    private int regeneration;

    public Attribute() {
        //No-args constructor
    }

    public Attribute(int health, int mana, int attack, int intelligence, int defense, int magicalResistance, int speed,
                     int regeneration) {
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.intelligence = intelligence;
        this.defense = defense;
        this.magicalResistance = magicalResistance;
        this.speed = speed;
        this.regeneration = regeneration;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public void setMagicalResistance(int magicalResistance) {
        this.magicalResistance = magicalResistance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRegeneration() {
        return regeneration;
    }

    public void setRegeneration(int regeneration) {
        this.regeneration = regeneration;
    }

    @Override
    public String toString() {
        return "Attribute{" +
            "health=" + health +
            ", mana=" + mana +
            ", attack=" + attack +
            ", intelligence=" + intelligence +
            ", defense=" + defense +
            ", magicalResistance=" + magicalResistance +
            ", speed=" + speed +
            ", regeneration=" + regeneration +
            '}';
    }
}
