package ClaseOperacionales;

import Clases.Bus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionBuses {
    private static List<Bus> listadoBuses=new ArrayList<Bus>();

    public GestionBuses(){
        QuemarDatos();
        System.out.printf("Tamanio de la lista"+listadoBuses.size());
    }


    /**
     * Añade un bus a la lista comprobando si ya esta registrado por placa
     * @param bus
     * @return true si se añade a la lista, false si no
     */
    public boolean addBus(Bus bus){
        if(busquedaUsuario(bus.getPlaca())==null){
            listadoBuses.add(bus);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Busca en la lista de usuarios por placa
     * @param placa
     * @return un objeto usuario si encuentra en la lista, null si no encuentra
     */
    public Bus busquedaUsuario(String placa){
        for (Bus bus1 : listadoBuses) {
            if(bus1.getPlaca().equals(placa)){
                return bus1;
            }
        }
        return null;
    }

    private void QuemarDatos(){

        addBus(new Bus("PCA-6131","A0001J5",279,new Date(123,5,11),5,20));
        addBus(new Bus("PTJ-560","A00012F5",1000,new Date(123,6,11),5,20));

    }

}
