package ar.com.momo.monster.mobile.model.entity.items;

import java.io.Serializable;
import java.util.Map;

/**
 * This class represents the basic item structure
 */
public class Item implements Serializable, Craftable {

    private String name;
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Item() {
        //No-args constructor
    }

    Item(String name, String description, int buyPrice, int sellPrice) {
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", buyPrice=" + buyPrice +
            ", sellPrice=" + sellPrice +
            '}';
    }

    @Override
    public Item craft(Map<Item, Integer> materials) {
        return this;
    }
}
