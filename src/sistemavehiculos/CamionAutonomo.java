/**
 * Esta clase hereda y sobreescribe los metodos de la clase {@link Vehiculo}
 * de modo a adaptar a las características de un camión autónomo.
 * 
 * @authores Karina bogarin y Kevin Gimenez
 * @version 1.0
 * @since  04/2026
 */
public class CamionAutonomo extends Vehiculo {
    private double combustible; 
    
    /**
     * Constructor de la clase.
     * @param id : Identificador del camión (vehículo).
     * @param combustible : Litros de combustible que posee el camión.
     */
    public CamionAutonomo(int id, int combustible){
        super(id);
        this.combustible = combustible;
    }
    
    // Sobreescritura de los métodos de la clase Vehículo.
    @Override
    public void patronMovimiento(){
        System.out.println("Camion " + getId() + " saliendo del deposito...");
    }
    @Override
    public void ubicarVehiculo(){
        System.out.println("Camion " + getId() + " circulando a 80Km/h sobre RN1(Km 12)");
    }
    
    // Getter del combustible.
    public double getCombustible(){
        return combustible;
    }
}
