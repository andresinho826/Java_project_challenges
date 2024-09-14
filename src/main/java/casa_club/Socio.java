package casa_club;

public class Socio {
    private String nombre;
    private int antiguedad;

    public Socio(String n, int a){
        this.nombre = n;
        this.antiguedad = a;

    }
    public String getNombre(){
        return nombre;
    }

    public int getAntiguedad(){
        return antiguedad;
    }
}
