package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Reptile extends Animal{

    public Reptile() {

        setLatinName("LNÁj");
        setSex(Sex.Female);
        setWeigthInKg(45);
    }

    @Override
    public void move() {
        System.out.println("Reptile is moving");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weigth"
                + getWeigthInKg() + "\tSex: " + getSex();
    }
}
