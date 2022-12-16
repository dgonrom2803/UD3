public class SumaMultiplos3y5 {
    public static void main(String[] args) {
        int n = 15;
        int result1 = 0;
        int result2 = 0;
        for (int i=3; i<=n; i++){
            if (i % 3 !=0)
            continue;
            result1 += i;
        }
        for (int i=5; i<=n; i++){
            if (i % 5 !=0)
            continue;
            result2 += i;
        }
        System.out.println("La suma de los múltiplos de 3 y 5 hasta " + n + " es
         = " +(result1 + result2));
    }
}
