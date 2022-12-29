package ar.com.momo.monster.mobile.model.enums;

public enum Upgrade {

  HEALTH_UP(100, 10, 0, 0, 0, 0, 0, 0, 0),
  HEALTH_UP_PLUS(1500, 100, 0, 0, 0, 0, 0, 0, 0),
  HEALTH_UP_PLUS_PLUS(5000, 300, 0, 0, 0, 0, 0, 0, 0),
  MANA_UP(100, 0, 10, 0, 0, 0, 0, 0, 0),
  MANA_UP_PLUS(1500, 0, 100, 0, 0, 0, 0, 0, 0),
  MANA_UP_PLUS_PLUS(5000, 0, 300, 0, 0, 0, 0, 0, 0),
  ATTACK_UP(100, 0, 0, 2, 0, 0, 0, 0, 0),
  ATTACK_UP_PLUS(1500, 0, 0, 20, 0, 0, 0, 0, 0),
  ATTACK_UP_PLUS_PLUS(5000, 0, 0, 40, 0, 0, 0, 0, 0),
  INTELLIGENCE_UP(100, 0, 0, 0, 2, 0, 0, 0, 0),
  INTELLIGENCE_UP_PLUS(1500, 0, 0, 0, 20, 0, 0, 0, 0),
  INTELLIGENCE_UP_PLUS_PLUS(5000, 0, 0, 0, 40, 0, 0, 0, 0),
  DEFENSE_PHYSICAL_UP(100, 0, 0, 0, 0, 2, 0, 0, 0),
  DEFENSE_PHYSICAL_UP_PLUS(1500, 0, 0, 0, 0, 20, 0, 0, 0),
  DEFENSE_PHYSICAL_UP_PLUS_PLUS(5000, 0, 0, 0, 0, 40, 0, 0, 0),
  MAGICAL_RESISTANCE_UP(100, 0, 0, 0, 0, 0, 2, 0, 0),
  MAGICAL_RESISTANCE_UP_PLUS(1500, 0, 0, 0, 0, 0, 20, 0, 0),
  MAGICAL_RESISTANCE_UP_PLUS_PLUS(5000, 0, 0, 0, 0, 0, 40, 0, 0),
  SPEED_UP(100, 0, 0, 0, 0, 0, 0, 2, 0),
  SPEED_UP_PLUS(1500, 0, 0, 0, 0, 0, 0, 5, 0),
  SPEED_UP_PLUS_PLUS(5000, 0, 0, 0, 0, 0, 0, 10, 0),
  REGENERATION_UP(100, 0, 0, 0, 0, 0, 0, 0, 10),
  REGENERATION_UP_PLUS(1500, 0, 0, 0, 0, 0, 0, 0, 20),
  REGENERATION_UP_PLUS_PLUS(5000, 0, 0, 0, 0, 0, 0, 0, 40);

  private int cost;
  private int health;
  private int mana;
  private int attack;
  private int intelligence;
  private int defense;
  private int magicalResistance;
  private int speed;
  private int regeneration;

  Upgrade(int cost, int health, int mana, int attack, int intelligence, int defense, int magicalResistance, int speed,
          int regeneration) {
    this.cost = cost;
    this.health = health;
    this.mana = mana;
    this.attack = attack;
    this.intelligence = intelligence;
    this.defense = defense;
    this.magicalResistance = magicalResistance;
    this.speed = speed;
    this.regeneration = regeneration;
  }
}
