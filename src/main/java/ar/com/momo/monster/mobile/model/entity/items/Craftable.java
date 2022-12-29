package ar.com.momo.monster.mobile.model.entity.items;

import java.util.Map;

public interface Craftable {
    public Item craft(Map<Item, Integer> materials);
}
