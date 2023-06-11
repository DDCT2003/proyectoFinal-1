package Clases;

import java.time.LocalTime;

public class Horario {

    private int frecuencia;//Si es 1 es de lunes a viernes, si es 2 es fin de semana y si es 3 es alternado.
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String codigo;
    private static int contador=0;

    public Horario(int frecuencia, LocalTime horaInicio, LocalTime horaFin) {
        this.frecuencia = frecuencia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        codigo= "HO-"+contador;
        contador++;
    }


}
