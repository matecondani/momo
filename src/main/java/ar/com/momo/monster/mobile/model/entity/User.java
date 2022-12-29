package ar.com.momo.monster.mobile.model.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import  ar.com.momo.monster.mobile.model.entity.items.Equipment;
import  ar.com.momo.monster.mobile.model.entity.items.Item;
import  ar.com.momo.monster.mobile.model.enums.BodyPart;
import  ar.com.momo.monster.mobile.model.enums.Spell;
import  ar.com.momo.monster.mobile.model.enums.Upgrade;

/**
 * this class that represents the user
 */
@Document
public class User implements Serializable {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String name;

    private String sprite;
    private Map<Item, Integer> items;
    private List<Momo> momos;
    private Set<Spell> spells; //TODO implement for battles
    private Attribute attributes;
    private MomoAttribute momosAttributes;
    private Map<BodyPart, Equipment> equipment;
    private Wallet wallet;
    private Set<Upgrade> upgrades;

    public User() {
        //No-args constructor
    }

    public User(ObjectId id, String name, String sprite, Map<Item, Integer> items, List<Momo> momos, Set<Spell> spells,
                Attribute attributes, MomoAttribute momosAttributes, Map<BodyPart, Equipment> equipment, Wallet wallet,
                Set<Upgrade> upgrades) {
        this.id = id;
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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public Map<BodyPart, Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(Map<BodyPart, Equipment> equipment) {
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
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
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
