package zoo;

/*
 aRCe
*/
public class Animales {
    private final String nombre;
    private final String id;
    private final int edad;
    private final String especie;
    private boolean estadoJaula = false;
    private boolean hambre = false;
    private boolean juego = false;

    public Animales(String nombre, String id, int edad, String especie) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.especie = especie;
    }

    public boolean isEstadoJaula() {
        return estadoJaula;
    }

    public void setEstadoJaula(boolean estadoJaula) {
        this.estadoJaula = estadoJaula;
    }

    public boolean isHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean isJuego() {
        return juego;
    }

    public void setJuego(boolean juego) {
        this.juego = juego;
    }

    public String datos(){
        if(hambre ==false){
            return "\n Nombre: "+nombre+"\n Su id es: "+id+"\n Tiene: "+edad+" años."+"\n Es un: "+especie+"\n"+nombre+" se encuentra triste, tiene mucha hambre";    
        }
        else if(estadoJaula == false){
            return "\n Nombre: "+nombre+"\n Su id es: "+id+"\n Tiene: "+edad+" años."+"\n Es un: "+especie+"\n"+nombre+" se encuentra triste, su casa está sucia";
        }
        else if(juego == false){
            return "\n Nombre: "+nombre+"\n Su id es: "+id+"\n Tiene: "+edad+" años."+"\n Es un: "+especie+"\n"+nombre+" se encuentra triste, no ha jugado";
        }
        else{
            return "\n Nombre: "+nombre+"\n Su id es: "+id+"\n Tiene: "+edad+" años."+"\n Es un: "+especie+"\n"+nombre+" ya está feliz, buen trabajo. ";
        } 
        
        
    }
}
