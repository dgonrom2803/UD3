public class Bucle {
    public static void main(String[] args) {
        final int MAX = 10;
        int enteroRandom = (int) (Math.random()*MAX);
        int Salir = 3;

        while (enteroRandom!=Salir){
            enteroRandom = (int) (Math.random()*MAX);
            System.out.println(enteroRandom);
        }
       
    }
    
}

