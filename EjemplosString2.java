
/**
 * Distintos tipos de ejercicios string.
 */
public class EjemplosString2 {
    /**
     * 
     * @param args Este es el parametro utilizado en
     */
    public static void main(String[] args) {
        // Crear una variable String
        String s = "Hola";
        String nombre = "Diego";
        String apellido = "González";
        int edad = 21;
        int a = 2;
        double b = 6.3;
        double resultado2 = 1.5;
        // Imprimir el valor de la variable
        System.out.println(s);
        System.out.println("Hola " + nombre);

        // Imprimir con formato
        System.out.printf("Hola %s %s, tengo: %d años ", nombre, apellido, edad);
        System.out.printf("\nNOMBRE: %s %s \nEDAD: %d años ", nombre, apellido, edad);
        System.out.printf("\n\"Primero\\Segundo\\Tercero\"");
        System.out.printf("\n%.1f\\%s = %.2f", b, a, resultado2);

    }

}
