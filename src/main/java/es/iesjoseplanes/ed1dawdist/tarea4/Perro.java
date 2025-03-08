package es.iesjoseplanes.ed1dawdist.tarea4;

/** 
 * un tipo de mamifero
 * @author Gloria
 */
public class Perro extends Mamifero {
    
    /** 
     * constructor de perro 
     * @param nombre el nombre del perro
     */
    
    public Perro(String nombre) {
    super(nombre);
}
    
     /**
     * Simula la acción de dormir del perro.
     * El perro debe dormir en función del ejercicio que realiza.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

      /**
     * Simula la acción de ladrar del perro.
     * Es una labor social de guarda.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

     /**
     * Simula la acción de gruñir del perro.
     * Es un sonido ronco y sostenido.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

     /**
     * Simula la acción de relacionarse con otro animal.
     * 
     * @param p El animal con el que se relaciona.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.nombre);
    }
    
}
