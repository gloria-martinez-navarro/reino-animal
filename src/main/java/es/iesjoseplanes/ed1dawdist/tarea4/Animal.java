package es.iesjoseplanes.ed1dawdist.tarea4;
/**
 * Animal generico con nombre
 * 
 * @author Gloria
 *  
 */
public class Animal {
    
    private String nombre;
    
  /**
     * Constructor de la clase Animal.
     * 
     * @param nombre El nombre del animal.
     */
    
    public Animal(String nombre) {
    this.nombre = nombre;
}
    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    
    
     public String getNombre() {
        return nombre;
    }

    /**
     * establece el nombre del animal
     * @param nombre nuevo nombre del animal 
     */
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Devuelve una vista en cadena del animal.
     * 
     * @return Una cadena que representa al animal.
     */
        
    String ToString() {
        return this.getNombre();
    }
    
    
    /**simula la accion de comer*/
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }
    
    /**simula la accion de dormir*/
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**simula la accion de reproducirse*/
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**simula la accion de relacionarse
     * @param a El animal con el que se relaciona
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    } 
      
 
}
