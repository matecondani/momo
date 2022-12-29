package ar.com.momo.monster.mobile.model.entity.items;

import java.util.Map;

import  ar.com.momo.monster.mobile.model.entity.Attribute;

/**
 * Equipment of a User, each Item can be assigned to a part of it's body if it's equipable.
 */
public class Equipment extends Item implements Equipable {

    private Attribute attribute;

    @Override
    public Attribute equip() {
        return this.attribute;
    }

    @Override
    public Attribute unEquip() {
        return this.attribute;
    }

    @Override
    public Item craft(Map<Item, Integer> materials) {
        return this;
    }
}
