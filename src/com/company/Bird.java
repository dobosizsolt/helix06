package com.company;


public class Bird extends Animal {


    public Bird() {

        setLatinName("áéjklá");
        setSex(Sex.Male);
        setWeigthInKg(8);
    }

    public void move() {
        System.out.println("The world is mine");
    }

    @Override
    public String toString() {
        return "Latin name: " + getLatinName() + "\t Weigth"
                + getWeigthInKg() + "\tSex: " + getSex();
    }
}
