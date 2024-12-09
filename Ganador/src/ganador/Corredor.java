
package ganador;

/*
 aRCee
*/
public class Corredor {
    private String numA,nombre;
    private int tiempo;

    public Corredor(String numA, String nombre, int tiempo) {
        this.numA = numA;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }
    public String mostrarDatos(){
        return "\nCorredor: "+numA+"\n Nombre: "+nombre+"\n Tiempo: "+tiempo;
    }
    public static int masRápido(Corredor corredor[]){
        int t;
        int indice = 0; 
        t = corredor[0].getTiempo();
        for(int i=1;i<corredor.length;i++){
            if(corredor[i].getTiempo()<t){
                t = corredor[i].getTiempo();
                indice = i;
            }
        }
        return indice;
        
    }
}
