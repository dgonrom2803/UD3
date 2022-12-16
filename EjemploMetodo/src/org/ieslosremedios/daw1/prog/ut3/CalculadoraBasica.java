package org.ieslosremedios.daw1.prog.ut3;

/**
 *
 */
public class CalculadoraBasica {
    double suma (double a, double b) {
        return a + b;
    }

    Integer suma (Integer a, Integer b, Integer c) {
        return a + b + c;
    }
    double resta (double a, double b) {
        return a - b;
    }
    Integer resta (Integer a, Integer b, Integer c) {
        return a - b - c;
    }
    Integer multiplicacion (Integer a, Integer b) {
        return a * b;
    }
    Integer division (Integer a, Integer b) {
        return a % b;
    }
}
