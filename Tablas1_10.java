public class Tablas1_10 {
    public static void main(String[] args) {
        final int N = 10;
        int num = 1;
        while (num != N + 1){
                System.out.println("Tabla del : "+ num);
            for (int i = 1; i<=N; i++) {
            System.out.println((num + " x " + i) + " = " + num*i);
            
            }
        num = num + 1;
        }
    }
}

