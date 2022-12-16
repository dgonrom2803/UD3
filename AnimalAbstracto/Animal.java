public abstract class Animal {

    Boolean mamífero;

    abstract Integer getNumPatas();

    Boolean esMamifero() {
        return mamífero;
    }

    void dormir (){
        System.out.println("zZZzZZzzZ");
    }
     abstract void hablar();
}