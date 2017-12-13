package com.company;

enum Sex{Male, Female};
/**
 * Created by java1 on 2017.12.13..
 */
public abstract class Animal {

    private String latinName;
    private float weigthInKg;
    private Sex sex;

    public abstract void move ();

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public float getWeigthInKg() {
        return weigthInKg;
    }

    public void setWeigthInKg(float weigthInKg) {
        this.weigthInKg = weigthInKg;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "latinName='" + latinName + '\'' +
                ", weigthInKg=" + weigthInKg +
                ", sex=" + sex +
                '}';
    }
}
