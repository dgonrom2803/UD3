public class PiramideAsteriscos {
public static void main(String[] args) {
    int numfilas = 3;

    for (int altura = 1; altura <=numfilas; altura++){
        for(int espacio = 1; espacio<=numfilas-altura; espacio++){
            System.out.print(" ");
        }

        for(int asteriscos = 1; asteriscos<=(altura*2)-1; asteriscos++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
}
