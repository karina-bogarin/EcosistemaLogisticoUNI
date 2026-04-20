/**
 * Esta clase hereda de {@link Vehiculo} e implementa {@link IConectable}.
 * Se trata de un dron transportador que trabaja con GPS.
 * 
 * @author Kevin Gimenez
 * @version 1.0
 * @since  04/2026
 */
public class DronTransporte extends Vehiculo implements IConectable {
    private int battery; 
    
    /**
     * Constructor de la clase.
     * @param id : identificador del dron (Vehiculo)
     * @param battery : Nivel de batería del dron.
     */
    public DronTransporte(int id, int battery){
        super(id);
        this.battery = battery;
    }
    
    //Sobreescritura de los metodos de la clase Vehiculo y IConectable.
    @Override
    public void patronMovimiento(){
        System.out.println("Dron " + getId() + " despegando...");
    }
    
    @Override
    public void sincronizarGPS(){
        System.out.println("Sincronizando satelites para ubicar al dron...");
    }
    
    @Override
    public void ubicarVehiculo(){
        System.out.println("Dron " + getId() + " se dirige hacia el Norte a 25Km/h.");
    }
}
