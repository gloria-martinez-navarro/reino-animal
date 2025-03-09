package es.iesjoseplanes.ed1dawdist.tarea4;

public class Principal {

    public static void main(String[] args) {

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Este programa demuestra el uso de las clases Animal, Mamifero, Perro y Gato.
 * 
 * <p>Esquema de clases de reino-animal:</p>
 * <pre>
 *                  Animal
 *                    |
 *                    |
 *                Mamifero
 *                /       \
 *               /         \        
 *          Perro          Gato
 * </pre>
 * 
 * @author Gloria
 * 
 */

        // Creación de instancias de las clases
        Animal animal = new Animal("Delfín");
        Mamifero mamifero = new Mamifero("León");
        Perro toby = new Perro("Lacasito");
        Gato isidoro = new Gato("Galleta");
        
        // Establecer la cantidad de pelos del gato
        isidoro.pelos = 4;

        // Polimorfismo: asignar un Gato a una variable de tipo Animal
        animal = isidoro;

       
        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.pelos);

        // Creación de un array de Animales
        Animal array[] = new Animal[4];
        
        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
