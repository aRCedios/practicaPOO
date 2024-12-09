package areatriangulos;
//Autor: Daniel Arce
import javax.swing.JOptionPane;
public class AreaTriangulos {
    public static void main(String[] args) {
        double base,lado;
        int nTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos triángulos quiere? "));
        int indice;
        TrianguloIsosceles triangulo[] = new TrianguloIsosceles[nTriangulos];
        for(int i = 0;i<triangulo.length;i++){
            base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo #"+(i+1)+": "));
            lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del triangulo #"+(i+1)+": "));
            triangulo[i] = new TrianguloIsosceles(base,lado);
            JOptionPane.showMessageDialog(null, "El perimetro de este triangulo es: "+triangulo[i].obtenerPerimetro());
            JOptionPane.showMessageDialog(null, "El área de este triangulo es: "+triangulo[i].obtenerArea());
            
        }
        indice = TrianguloIsosceles.mayorArea(triangulo);
        JOptionPane.showMessageDialog(null, "El triangulo con mayor área es: "+triangulo[indice].mostrarDatos()); 
    }
}
