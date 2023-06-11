package Clases;

public class Cliente extends Usuario{

    private String correoElectronico;

    public Cliente(String cedula, String nombre, String apellido, String correoElectronico) {
        super(cedula, nombre, apellido);
        this.correoElectronico = correoElectronico;

    }


}
