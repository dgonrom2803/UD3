public class Humano extends Animal{
    final static Integer numPatas = 2;

    final static Boolean mamifero = true;
    Integer getNumPatas(){
        return numPatas;
    }
    Boolean esMamifero(){
        return mamifero;
    }

    void hablar() {
        System.out.println("Hola");
    }
}
