package es.iesjoseplanes.ed1dawdist.tarea4;

/** un tipo de mamifero
 * 
 * @author Gloria
 */

public class Gato extends Mamifero {
    
    private int pelos;

    /**
     * constructor de gato
     * @param nombre nombre del gato
     */
    public Gato(String nombre) {
    super(nombre);
}
        
    /**
     * Obtiene la cantidad de pelos del gato
     * @return la cantidad de pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Establece la cantidad de pelos del gato
     * @param pelos La nueva cantidad de pelos del gato
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
    
    
      /**
     * Simula la acción de dormir del gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }
        
  /**
     * Simula la acción de maullar del gato.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

     /**
     * Simula la acción de relacionarse con otro animal.
     * 
     * @param p El animal con el que se relaciona.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.nombre);
    }  

}
