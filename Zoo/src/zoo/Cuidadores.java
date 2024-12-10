
package zoo;

/*
 aRCee
*/
public class Cuidadores {
    private final String nombre;
    private final String id;
    private final int edad;

    public Cuidadores(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    public void limpiarCasa(Animales animal1){
        if(animal1.isEstadoJaula()==false){
            animal1.setEstadoJaula(true);
        }
    }
    public void darComida(Animales animal1){
        animal1.setHambre(true);
    }
    public void jugar(Animales animal1){
        animal1.setJuego(true);
        
    }
    public String datos(){
        return "\n Nombre: "+nombre+"\nSu cedula es: "+id+"\n Tiene: "+edad+" años.";
    }
}
