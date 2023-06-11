package ClaseOperacionales;


import Clases.Horario;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GestionHorarios {

    private static List<Horario> listadoHorarios=new ArrayList<Horario>();

    public GestionHorarios(){
        QuemarDatos();
        System.out.printf("Tamanio de la lista"+listadoHorarios.size());
    }

    /**
     * Busca en la lista de horarios un horario igual
     * @param horario
     * @return un objeto usuario si encuentra en la lista, null si no encuentra
     */
    public boolean addBus(Horario horario){
        for (Horario horario1 : listadoHorarios) {
            if(horario1.equals(horario)){
                return false;
            }
        }
        listadoHorarios.add(horario);
        return true;
    }

    private void QuemarDatos(){
        listadoHorarios.add(new Horario(1,LocalTime.of(12, 30, 45),LocalTime.of(13, 30, 45)));
    }


}
