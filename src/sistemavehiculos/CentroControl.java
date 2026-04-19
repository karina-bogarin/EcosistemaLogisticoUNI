package sistemavehiculos;
import java.util.*;
/**
 * Esta clase es el centro de control de todos los vehículos creados en base a 
 * la clase {@link Vehiculo}. 
 * Contiene un metodo para registrar a los nuevos 
 * vehiculos, para monitorearlos todos a la vez y tambien para ubicarlos.
 * 
 * @author Karina Bogarin.
 * @author Kevin Gimenez.
 * @version 1.0
 * @since 04/2026
 */
public class CentroControl {
    private ArrayList<Vehiculo> coleccion; //Registro de todos los vehiculos.
    
    /**
     * Constructor de la clase.
     */
    public CentroControl(){
        coleccion = new ArrayList<>();
    }
    
    // Registra cada vehiculo creado en la coleccion cuando se lo llama.
    public void registrarUnidad(Vehiculo v){
        coleccion.add(v);
    }
    
    // Monitorea el movimiento de todos los vehiculos que se encuentran en la coleccion.
    public void monitorearFlota(){
        for(Vehiculo v: coleccion){
            v.patronMovimiento();
        }
    }
    
    // Imprime la ubicación de todos los vehiculos de la coleccion.
    public void ubicarVehiculos(){
        for(Vehiculo v: coleccion){
            v.ubicarVehiculo();
        }
    }
}
