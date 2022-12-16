public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Futbolista futbolista1 = new Futbolista();
        Equipo equipo1 = new Equipo();

        persona1.setNombre("Diego");
        persona1.setPrimerApellido("González");
        persona1.setSegundoApellido("Romero");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Nombre completo: " + persona1.getNombre() + " " + persona1.getPrimerApellido() + " " + persona1.getSegundoApellido());
        persona1.setEdad(21);
        System.out.println("Edad: " + persona1.getEdad());
        futbolista1.setLicencia(3455262);
        System.out.println("Nº Licencia: " + futbolista1.getLicencia());
        futbolista1.setEquipo("Real Madrid CF");
        System.out.println("Equipo: " + futbolista1.getEquipo());
        equipo1.setCiudad("Madrid");
        System.out.println("Ciudad: " + equipo1.getCiudad());
        equipo1.setLiga("Liga BBVA");
        System.out.println("Liga: " + equipo1.getLiga());


    }
}
