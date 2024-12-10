package zoo;
//Autor: Daniel Arce
import javax.swing.JOptionPane;
public class Zoo {
    public static void main(String[] args) {
        String nombreP = JOptionPane.showInputDialog("Ingrese el nombre de un cuidador: ");
        String idP = JOptionPane.showInputDialog("Ingrese el numero de identificación del cuidador: ");
        int edadP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
        Cuidadores cuidador1 = new Cuidadores(nombreP,idP,edadP);
        String nombreA = JOptionPane.showInputDialog("Ingrese el nombre de un animal: ");
        String idA = JOptionPane.showInputDialog("Ingrese el numero de identificación del animal: ");
        int edadA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de su animal: "));
        String especie = JOptionPane.showInputDialog("Ingrese la especie de su animal: ");
        Animales animal1 = new Animales(nombreA,idA,edadA,especie);
        JOptionPane.showMessageDialog(null, "Información cuidador: "+cuidador1.datos());
        JOptionPane.showMessageDialog(null, "Información animal: "+animal1.datos());
        JOptionPane.showMessageDialog(null, "El animalito se encuentra triste, seguramente tiene hambre, su casa está sucia o quiere jugar, pongamos al cuidador a trabajar.");
        cuidador1.darComida(animal1);
        JOptionPane.showMessageDialog(null, "Información animal: "+animal1.datos());
        cuidador1.limpiarCasa(animal1);
        JOptionPane.showMessageDialog(null, "Información animal: "+animal1.datos());
        cuidador1.jugar(animal1);
        JOptionPane.showMessageDialog(null, "Información animal: "+animal1.datos());
        JOptionPane.showMessageDialog(null, "El cuidador ha terminado su trabajo y se va a dormir. ");
        
        
        
    }
}
