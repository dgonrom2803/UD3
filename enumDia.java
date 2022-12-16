public class enumDia {
    public static void main(String[] args) {
        enum Dia {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }
        Dia diaDeHoy = Dia.JUEVES;
        switch (diaDeHoy) {
        case LUNES:
            System.out.println("Lunes");
            break;
        case MARTES:
            System.out.println("Martes");
            break;
        case MIERCOLES:
            System.out.println("Miércoles");
            break;
        case JUEVES:
            System.out.println("Jueves");
            break;
        case VIERNES:
            System.out.println("Viernes");
            break;
        default:
            System.out.println("Finde");
            break;
    }
}
}
