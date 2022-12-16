public class AleatorioBreak {
    public static void main(String[] args) {
        final int MAX = 10;
        int enteroRandom = (int) (Math.random()*MAX);
        int Salir = 3;

        for(enteroRandom = (int) (Math.random()*MAX)){
            if (enteroRandom==Salir){
                break;
            }
        }
       
    }
    
}

