package Clases;

import java.util.Date;

public class Bus {
    private String placa;
    private String matricula;
    private int Kilometraje;
    private Date fechamantenieminto;
    private int estado;//1 esta el bus activo, 0 esta el bus dado de baja, 2 esta fuera por mantenimiento
    private int numeroDefectos;
    private int capacidadPersonas;

    public Bus(String placa, String matricula, int kilometraje, Date fechamantenieminto, int numeroDefectos, int capacidadPersonas) {
        this.placa = placa;
        this.matricula = matricula;
        Kilometraje = kilometraje;
        this.fechamantenieminto = fechamantenieminto;
        this.estado =1;
        this.numeroDefectos = numeroDefectos;
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getPlaca() {
        return placa;
    }
}
