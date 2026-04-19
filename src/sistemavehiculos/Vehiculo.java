package sistemavehiculos;

/**
 * Esta clase abstracta Vehiculo es una superclase que permitirá la herencia
 * de distintos tipos de vehículos con distintas acciones.
 * 
 * @author Karina Bogarin 
 * @author Kevin Gimenez
 * @version 1.0
 * @since 04/2026
 */
public abstract class Vehiculo {
    private int id;
    
    /*
    * Constructor de la clase Vehiculo.
    * @param id : identificador de los vehículos.
    */
    public Vehiculo(int id){
        this.id = id;
    }
    
    // Getter del identificador id.
    public int getId(){
        return id;
    }
    
    /* Métodos abstractos que podremos sobreescribir en las clases herederas de
     * esta clase.
     */
    public abstract void patronMovimiento(); // Patron de movimiento del vehiculo
    public abstract void ubicarVehiculo(); // Ubicacion del vehiculo
}
