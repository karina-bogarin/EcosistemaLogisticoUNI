package sistemavehiculos2;

/**
 * Esta clase abstracta Vehiculo es una superclase que permitira la herencia
 * de distintos tipos de vehiculos con distintas acciones.
 * 
 * * @author Karina Bogarin
 * @version 2.0
 * @since 05/2026
 */
public abstract class Vehiculo {
    
    private final String id;
    private String modelo;
    
    /*
    * Constructor de la clase Vehiculo.
    * @param id : identificador de los vehiculos.
    */
    public Vehiculo(String id, String modelo){
        this.id = id;
        this.modelo = modelo;
    }
    
    // Accesor del identificador id.
    public String getId(){
        return id;
    }
    
    // Accesor del atributo "modelo" de Vehiculo.
    public String getModelo(){
        return this.modelo;
    }
    
    // Mutador del atributo "modelo" de vehiculo.
    public void setModelo(String nuevoModelo){
        this.modelo = nuevoModelo;
        
    }
    /* Metodos abstractos que podremos sobreescribir en las clases herederas de
     * esta clase.
     */
    public abstract void patronMovimiento(); // Patron de movimiento del vehiculo
    public abstract void ubicarVehiculo(); // Ubicacion del vehiculo
}
