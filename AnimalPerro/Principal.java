public class Principal {
    public static void main(String[] args) {

        Perro perro = new Perro();

        perro.nombre = "Lola";

        perro.raza = "Labrador";
        System.out.println("¡Guau! mi nombre es " + perro.nombre + " y soy un " + perro.raza);

        perro.imprime();
        perro.imprimePorPartes();

        Perro perro2 = new Perro("Perro de agua");
        perro2.imprimePorPartes();

        Perro perro3 = new Perro("Lolo", "Perro de agua");
        perro3.imprimePorPartes();
        perro2.imprimePorPartes();
        perro3.imprimePorPartes();
    }
}