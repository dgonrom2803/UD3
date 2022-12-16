package org.ieslosremedios.daw1.prog.ut3;

public class MainPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        System.out.println("Persona1");
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Diego");
        persona1.setPrimerApellido("González");
        persona1.setSegundoApellido("Romero");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Nombre completo: " );
        System.out.println("Edad: " + persona1.getEdad());
        persona1.setEdad(21);
        System.out.println("Edad: " + persona1.getEdad());


    }
}


