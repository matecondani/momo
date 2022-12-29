package ar.com.momo.monster.mobile.model.entity;

import java.io.Serializable;

/**
 * Wallet of an User, where currencies will be saved
 */
public class Wallet implements Serializable {

    private int coins;
    private int diamonds;

    public Wallet() {
        //No-args constructor
    }

    public Wallet(int coins, int diamonds) {
        this.coins = coins;
        this.diamonds = diamonds;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(int diamonds) {
        this.diamonds = diamonds;
    }

    @Override
    public String toString() {
        return "Wallet{" +
            "coins=" + coins +
            ", diamonds=" + diamonds +
            '}';
    }
}
