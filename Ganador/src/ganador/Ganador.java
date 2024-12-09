package ganador;
//Autor: Daniel Arce
import javax.swing.JOptionPane;
public class Ganador {
    public static void main(String[] args) {
        String numero,nombre;
        int tiempo;
        int contador = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas participaron? "));
        int ganador = 0;
        Corredor corredor[] = new Corredor[contador]; //aquí creo el arreglo de objetos
        for(int i=0;i<contador;i++){
            numero = JOptionPane.showInputDialog("Ingrese el número del atleta #"+(i+1)+":");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del atleta #"+(i+1)+":");
            tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de carrera en segundos #"+(i+1)+":"));
            corredor[i] = new Corredor(numero,nombre,tiempo);            
        }
        ganador = Corredor.masRápido(corredor);
        JOptionPane.showMessageDialog(null, "El ganador es: "+corredor[ganador].mostrarDatos());
    }
     
}
