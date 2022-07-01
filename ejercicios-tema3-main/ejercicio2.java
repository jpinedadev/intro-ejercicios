public class ejercicio2 {
    //segundo ejercicio
    /*
    Segunda parte:
    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene 
        el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.
    */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }

}
class Coche{
    int puertas=0;
    public void agregarPuertas(){ 
            this.puertas++; 
        }

}