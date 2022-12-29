package ar.com.momo.monster.mobile.model.entity;

import  ar.com.momo.monster.mobile.model.enums.Work;

/**
 * A momo is a User worker
 */
public class Momo {

    private String name;
    private Work work;
    private String colour;
    private String sprite;

    public Momo() {
        //No-Args constructor
    }

    public Momo(String name, Work work, String colour, String sprite) {
        this.name = name;
        this.work = work;
        this.colour = colour;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    @Override
    public String toString() {
        return "Momo{" +
            "name='" + name + '\'' +
            ", work=" + work +
            ", colour='" + colour + '\'' +
            ", sprite='" + sprite + '\'' +
            '}';
    }
}
