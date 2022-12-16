package org.ieslosremedios.daw1.prog.ut3;

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    private int edad;

    Persona () { nombre = "Anómimo";}
    Persona (String nombre, String primerApellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public void MostrarNombreCompleto(){
        System.out.println(nombre + " " + primerApellido + " " + segundoApellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mayorEdad (){
        if (edad < 18 ){
            System.out.println("Es menor de edad");
        }else {
            System.out.println("Es mayor de edad");
        }
    }
}
