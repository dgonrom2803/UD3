public class Perro extends Animal {

    final static Integer numPatas = 4;

    final static Boolean mamifero = true;

    Integer getNumPatas(){
        return numPatas;
    }
    Boolean esMamifero(){
        return mamifero;
    }
    void hablar() {
        System.out.println("Guau");
    }

}
