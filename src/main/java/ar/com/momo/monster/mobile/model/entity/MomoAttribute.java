package ar.com.momo.monster.mobile.model.entity;

import java.io.Serializable;

/**
 * Attributes for momos
 */
public class MomoAttribute implements Serializable {

    private int extraction;
    private int quantity;

    public MomoAttribute() {
        //No-args constructor
    }

    public MomoAttribute(int extraction, int quantity) {
        this.extraction = extraction;
        this.quantity = quantity;
    }

    public int getExtraction() {
        return extraction;
    }

    public void setExtraction(int extraction) {
        this.extraction = extraction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MomoAttribute{" +
            "extraction=" + extraction +
            '}';
    }
}
