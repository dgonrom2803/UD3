public class Ejercicioternario {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int mayor;
        int menor;

        mayor = (a >= b) ? a : b;
        System.out.println(mayor);
        menor = (a <= b) ? a : b;
        System.out.println(menor);
    }
}
