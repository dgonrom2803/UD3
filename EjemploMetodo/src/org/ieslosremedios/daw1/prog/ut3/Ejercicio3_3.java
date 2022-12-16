package org.ieslosremedios.daw1.prog.ut3;

import java.util.Random;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Random utilRandom = new Random ();
        int aleatorio1 = utilRandom.nextInt(100);
        System.out.println(aleatorio1);

        double aleatorio2 = Math.random() * 100;
        System.out.println(aleatorio2);
    }
}
