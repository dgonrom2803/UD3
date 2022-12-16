public class Principal {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal humano = new Humano();

        System.out.println("PERRO");
        Integer numPatas =perro.getNumPatas();
        System.out.println("Número de patas: " + numPatas);
        System.out.println("¿Es mamífero? " + perro.esMamifero());
        perro.dormir();
        perro.hablar();

        System.out.println("GATO");
        numPatas = gato.getNumPatas();
        System.out.println("Número de patas: " + numPatas);
        System.out.println("¿Es mamífero? " + gato.esMamifero());
        gato.dormir();
        gato.hablar();

        System.out.println("HUMANO");
        numPatas = humano.getNumPatas();
        System.out.println("Número de patas: " + numPatas);
        System.out.println("¿Es mamífero? " + humano.esMamifero());
        humano.dormir();
        humano.hablar();


    }
}
