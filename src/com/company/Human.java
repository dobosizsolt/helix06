package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Human extends Animal {

    public Human() {

        setLatinName("Antropo");
        setSex(Sex.Female);
        setWeigthInKg(65);
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weigth"
                + getWeigthInKg() + "\tSex: " + getSex();
    }
}
