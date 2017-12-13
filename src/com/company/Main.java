package com.company;

import java.util.Random;

public class Main {

    public enum SORT_DIRECTION{ASC, DESC} /**befejezni*/

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.move();
        System.out.println(bird.toString());

        Reptile reptile = new Reptile();
        reptile.move();
        System.out.println(reptile.toString());

        Mammel mammel = new Mammel();
        mammel.move();
        System.out.println(mammel.toString());


        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int getNumbers = random.nextInt(20);
            array[i] = getNumbers;
            System.out.println(array[i]);
        }

        insertionSort(array);
        System.out.println("\n");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }

        Ameoba ameoba = new Ameoba();
        ameoba.drawBoard();


    }

    public static void insertionSort(int[] array) {


        for (int i = 1; i < array.length; i++) {
            int j = i;
            while ((j > 0) && (array[j] < array[j-1])) {
                int getNum = array[j];
                array[j] = array[j - 1];
                array[j - 1] = getNum;
                --j;
            }

        }
    }
}
