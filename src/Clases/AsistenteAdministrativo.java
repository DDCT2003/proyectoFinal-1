package Clases;

public class AsistenteAdministrativo extends Usuario{
    private String sucursal;

    public AsistenteAdministrativo(String cedula, String nombre, String apellido, String sucursal) {
        super(cedula, nombre, apellido);
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
}
