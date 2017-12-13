package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Mammel extends Animal {

    public Mammel() {

        setLatinName("Jlézgh");
        setSex(Sex.Male);
        setWeigthInKg(49);
    }

    @Override
    public void move() {
        System.out.println("Glhkl époihz");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weigth"
                + getWeigthInKg() + "\tSex: " + getSex();
    }
}
