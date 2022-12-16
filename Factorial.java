public class Factorial {
    public static void main(String[] args) {
        int N = 4;
        int result = 1;
        System.out.println("El factorial de " + N + " es:");
        for (int i=N; i >= 1; i--){
            result *= i;
                   
        }
        System.out.println(result );
    }
}
