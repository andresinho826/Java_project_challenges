package casa_club;

public class Club {
    private Socio socio1 = new Socio("andres", 90);
    private Socio socio2 = new Socio("yura", 40);
    private Socio socio3 = new Socio("aaron",30);

    public void socioMayorAntiguedad(){
        if (socio1.getAntiguedad() > socio2.getAntiguedad()
        && socio1.getAntiguedad() > socio3.getAntiguedad()) {
            System.out.println("El socio con mayor antiguedad es: " +socio1.getNombre());

        } else if (socio2.getAntiguedad() > socio3.getAntiguedad()) {
            System.out.println("El socio con mayor antiguedad es: " + socio2.getNombre());

        }else {
            System.out.println("El socio con mayor antiguedad es: " +socio3.getNombre());
        }
    }

    public static void main(String[] args) {
        Club club = new Club();
        club.socioMayorAntiguedad();
    }
}
