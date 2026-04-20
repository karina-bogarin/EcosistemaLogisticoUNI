package sistemavehiculos;

/**
 * Gestión de las clases del sistema de Vehiculos. 
 * Nos ayuda a verificar el funcionamiento de nuestras clases y metodos.
 * 
 * @author Karina Bogarin.
 * @author Kevin Gimenez.
 * @version 1.0
 * @since 04/2026
 */
public class SistemaGestionDeVehiculos {
    public static void main(String[] args){
        CentroControl control = new CentroControl();
        
        System.out.println("BIENVENIDO AL SISTEMA DE GESTION DE VEHICULOS.\n");
        
        // Creamos una unidad de cada tipo de vehiculo.
        DronTransporte dron = new DronTransporte(1, 57);
        CamionAutonomo camion = new CamionAutonomo(2, 100);
        MotoDelivery moto = new MotoDelivery(3, 89);
        
        // Registramos las tres unidades creadas.
        control.registrarUnidad(dron);
        control.registrarUnidad(camion);
        control.registrarUnidad(moto);
        
        // Monitoreamos la flota de vehiculos que tenemos.
        control.monitorearFlota();
        
        System.out.println();
        
        // Sincronizamos el GPS del dron y la moto.
        dron.sincronizarGPS();
        moto.sincronizarGPS();
        
        System.out.println();
        
        // Pedimos la ubicacion de los vehiculos.
        control.ubicarVehiculos();
    }
}
