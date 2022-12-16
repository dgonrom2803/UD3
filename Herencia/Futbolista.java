public class Futbolista extends Persona{
    private Integer licencia;
    private String equipo;
    

    public Futbolista() {
    }

    public Futbolista(Integer licencia) {
        this.licencia = licencia;
    }

    public Futbolista(String nombre, Integer licencia) {
        this.licencia = licencia;
    }

    public String equipo () {
        return equipo;
    }

    public Integer getLicencia() {
        return licencia;
    }

    public void setLicencia(Integer licencia) {
        this.licencia = licencia;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
