package Clases;

public class Chofer extends Usuario{
    private String horario;

    public Chofer(String cedula, String nombre, String apellido, String horario) {
        super(cedula, nombre, apellido);
        this.horario = horario;
    }


}
