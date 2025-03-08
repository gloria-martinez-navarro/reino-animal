package es.iesjoseplanes.ed1dawdist.tarea4;
/**
 * Representa un tipo de animal, los mamiferos
 * @author Gloria
*/
public class Mamifero extends Animal {
    
    /**
     * constructor de mamifero
     * @param nombre el nombre del mamifero
     */

    public Mamifero(String nombre) {
    super(nombre);
}
     /**
     * Simula la acción de reproducirse del mamífero.
     * La reproducción de los mamíferos es vivípara.
     */
    
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }
    
     /**
     * Simula la acción de relacionarse con otro mamífero.
     * 
     * @param m El mamífero con el que se relaciona.
     */

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.nombre);
    }

 
}
