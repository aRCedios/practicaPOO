
package masbarato;

/*
 aRCee
*/

public class Vehiculos {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String mostrarDatos(){
        return "\nEl: "+marca+"\n modelo: "+modelo+"\n y su precio es de: "+precio;
        
    }
    public static int indiceMasBarato(Vehiculos carro[]){
        float precio;
        int indice = 0;
        precio = carro[0].getPrecio();
        for(int i=1;i<carro.length;i++){
            if(carro[i].getPrecio()<precio){
                precio = carro[i].getPrecio();
                indice = i;
            }
        }
        return indice;
        
    }
    
}
