package ar.com.momo.monster.mobile.model.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ar.com.momo.monster.mobile.model.entity.Attribute;
import ar.com.momo.monster.mobile.model.entity.Momo;
import ar.com.momo.monster.mobile.model.entity.MomoAttribute;
import ar.com.momo.monster.mobile.model.entity.Wallet;
import ar.com.momo.monster.mobile.model.entity.items.Equipment;
import ar.com.momo.monster.mobile.model.entity.items.Item;
import ar.com.momo.monster.mobile.model.enums.Spell;
import ar.com.momo.monster.mobile.model.enums.Upgrade;


public class UserDTO implements Serializable {

    private String name;
    private String sprite;
    private Map<Item, Integer> items;
    private List<Momo> momos;
    private Set<Spell> spells; //TODO implement for battles
    private Attribute attributes;
    private MomoAttribute momosAttributes;
    private Equipment equipment;
    private Wallet wallet;
    private Set<Upgrade> upgrades;

    public UserDTO() {
        //No-args constructor
    }

    public UserDTO(String name, String sprite, Map<Item, Integer> items, List<Momo> momos, Set<Spell> spells,
                   Attribute attributes, MomoAttribute momosAttributes, Equipment equipment, Wallet wallet,
                   Set<Upgrade> upgrades) {
        this.name = name;
        this.sprite = sprite;
        this.items = items;
        this.momos = momos;
        this.spells = spells;
        this.attributes = attributes;
        this.momosAttributes = momosAttributes;
        this.equipment = equipment;
        this.wallet = wallet;
        this.upgrades = upgrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Item, Integer> items) {
        this.items = items;
    }

    public List<Momo> getMomos() {
        return momos;
    }

    public void setMomos(List<Momo> momos) {
        this.momos = momos;
    }

    public Set<Spell> getSpells() {
        return spells;
    }

    public void setSpells(Set<Spell> spells) {
        this.spells = spells;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    public MomoAttribute getMomosAttributes() {
        return momosAttributes;
    }

    public void setMomosAttributes(MomoAttribute momosAttributes) {
        this.momosAttributes = momosAttributes;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Set<Upgrade> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(Set<Upgrade> upgrades) {
        this.upgrades = upgrades;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "name='" + name + '\'' +
            ", sprite='" + sprite + '\'' +
            ", items=" + items +
            ", momos=" + momos +
            ", spells=" + spells +
            ", attributes=" + attributes +
            ", momosAttributes=" + momosAttributes +
            ", equipment=" + equipment +
            ", wallet=" + wallet +
            ", upgrades=" + upgrades +
            '}';
    }
}
