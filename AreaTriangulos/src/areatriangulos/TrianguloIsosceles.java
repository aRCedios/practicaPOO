
package areatriangulos;

/*
 aRCe
*/
public class TrianguloIsosceles {
    private double base,lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    public double obtenerPerimetro(){
        double perimetro = (2*lado)+base;
        return perimetro;
    }
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)-(base*base)/4))/2; 
        return area;
    }
    public String mostrarDatos(){
        return "\n Base: "+ base+"\n Lado: "+lado+"\n Perimetro: "+obtenerPerimetro()+"\n Área: "+obtenerArea();
    }
    public static int mayorArea(TrianguloIsosceles triangulo[]){
        double area = triangulo[0].obtenerArea();
        int indice = 0; 
        for(int i = 1;i<triangulo.length;i++){
            if(area<triangulo[i].obtenerArea()){
                area = triangulo[i].obtenerArea();
                indice = i;
            }
            
        }
        return indice;
    }
}
