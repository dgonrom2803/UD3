public class Perro extends Animal {
    String raza;

    public Perro () {
        // Default constructor
    }

    public Perro(String raza) {

        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        super(nombre); 
        this.raza = raza;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + super.nombre + " y soy un " + raza);
        System.out.println("¡Guau! me llamo " + nombre + " y soy un " + raza);
    }

    void imprimePorPartes () {
        super.imprime();
        System.out.println(" y soy un " + raza);
    }
}
