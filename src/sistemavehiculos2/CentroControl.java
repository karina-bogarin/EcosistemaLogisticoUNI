package sistemavehiculos2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase es el centro de control y gestión de todos los vehículos.
 * Administra el ciclo de vida (CRUD) y el monitoreo operativo de la flota.
 * 
 * * @author Karina Bogarin
 * @version 2.0
 * @since 05/2026
 */
public class CentroControl {

    private final List<Vehiculo> listaVehiculos;

    public CentroControl() {
        this.listaVehiculos = new ArrayList<>();
    }
    
    // METODOS DE LA VERSION 1.0
    
    /**
     * Monitorea el movimiento de todos los vehículos que se encuentran 
     * en la flota.
     */
    public void monitorearFlota() {
        System.out.println("\n\tMONITOREO DE FLOTA EN TIEMPO REAL");
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay unidades activas para monitorear.");
            return;
        }
        listaVehiculos.forEach(v -> v.patronMovimiento());
    }

    /**
     * Imprime la ubicación actual de todos los vehículos del sistema.
     */
    public void ubicarVehiculos() {
        System.out.println("\n\tUBICACION GEOGRAFICA DE UNIDADES");
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay unidades registradas para ubicar.");
            return;
        }
        listaVehiculos.forEach(v -> v.ubicarVehiculo());
    }

    // METODOS CRUD - VERSION 2.0
    
     /**
     * Crea un nuevo vehículo en el sistema
     * @param v : nombre del vehiculo
     */
    public void crearVehiculo(Vehiculo v) {
        if(v!=null) listaVehiculos.add(v);
    }
    
    /**
     * Busca y retorna un vehiculo según su id, y si no existe no retorna nada.
     * @param id : identificador del vehiculo
     * @return vehiculo
     */
    public Vehiculo buscarVehiculo(String id) {
        for(Vehiculo v : listaVehiculos) {
            if(v.getId().equalsIgnoreCase(id)) {
                return v;
            } 
        }
        return null;
    }
    
     /**
     * Lista los vehiculos existentes en el sistema
     */
    public void listarVehiculos() {
        System.out.println("\n\tLISTA DE VEHICULOS");
        if(listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados en el sistema.");
            return;
        }
        listaVehiculos.forEach(v -> System.out.println(v.toString()));
    }
    
    /**
     * Modifica el modelo de un vehiculo existente en el sistema
     * @param id : identificador del vehiculo
     * @param nuevoModelo : el nuevo modelo del vehiculo
     * @return true si el vehiculo fue modificado con exito, false si no.
     */
    public boolean modificarVehiculo(String id, String nuevoModelo) {
        Vehiculo v = buscarVehiculo(id);
        if(v != null) {
            v.setModelo(nuevoModelo);
            return true;
        }
        return false; 
    }
    
    /**
     * Elimina un vehiculo de sistema basado en su id 
     * @param id : identificador del vehiculo
     * @return true si se elimino con exito
     */
    public boolean eliminarVehiculo(String id) {
        return listaVehiculos.removeIf(v -> v.getId().equalsIgnoreCase(id));
    }
    
    /**
     * Obtiene una lista con todos los identificadores id de los vehiculos
     * registrados en el sistema.
     * @return lista de id's
     */
    public List<String> obtenerListaIds() {
        return listaVehiculos.stream()
                .map(v -> String.valueOf(v.getId()))
                .collect(Collectors.toList());
    }
    
    /**
     * Busca un vehiculo a partir de su modelo
     * @param modelo : modelo del vehiculo
     * @return vehiculo
     */
    public List<Vehiculo> buscarPorModelo(String modelo){
        return listaVehiculos.stream()
                .filter(v -> v.getModelo().toLowerCase().contains(modelo.toLowerCase()))
                .collect(Collectors.toList());
    }
}
