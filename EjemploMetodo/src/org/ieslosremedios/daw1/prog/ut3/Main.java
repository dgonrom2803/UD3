package org.ieslosremedios.daw1.prog.ut3;

public class Main {
    //Calculadora con suma, resta, division y multiplicación.

    final static Integer a = 2;
    final static Integer b = 3;
    final static Integer c = 6;
    final static Double d = 2.5;
    final static Double e = 3.0;

    enum OPERACION {
        suma, resta, multiplicacion, division
    }

    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        OPERACION operacionSeleccionada = OPERACION.multiplicacion;

        basica.suma(2, 3);
        basica.suma(2, 3, 6);

        basica.resta(2, 3);
        basica.resta(2, 3, 6);

        basica.suma(2.5, 3.0);

        switch (operacionSeleccionada) {

            case suma:
                System.out.println("La suma de: " + a + " + " + b + " = " + basica.suma(a, b));
                break;
            case resta:
                System.out.println("La resta de: " + a + " - " + b + " = " + basica.resta(a, b));
                break;
            case multiplicacion:
                System.out.println("La multiplicación de: " + a + " * " + b + " = " + basica.multiplicacion(a, b));
                break;
            case division:
                System.out.println("La division de: " + a + " / " + b + " = " + basica.division(a, b));
                break;
        }

    }
}