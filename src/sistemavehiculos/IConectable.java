package sistemavehiculos;

/**
 * Interfaz de Definición de Contratos "IConectable".
 * Contiene un metodo que permite sicronizarGPS con los vehiculos que lo requieran.
 * 
 * @author Karina Bogarín.
 * @author Kevin Gimenez.
 * @version 1.0
 * @since 04/2026
 */
public interface IConectable {
    
    /* Metodo abstracto que será sobreescrito en todas las clases que implementen
     * IConectable. 
     */
    public abstract void sincronizarGPS();
}
