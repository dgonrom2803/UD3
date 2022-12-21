package Interfaz;

public class Impresora implements Imprimible{
    String pagina;

    public Impresora (){
        pagina = Imprimible.pagina;
    }

    @Override
    public void Imprime() {
        System.out.println(pagina);
    }

}
