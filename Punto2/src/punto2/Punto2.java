package punto2;
//Autor: Daniel Arce
import javax.swing.JOptionPane;
public class Punto2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Hola, quiero poner 1 punto en un tablero infinito ingrese la coordenada en x: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada en y: "));
        Punto punto1 = new Punto(x,y);
        System.out.println("Puedes mover el punto tanto como quieras en las 4 direcciones principales.");
        int contador= Integer.parseInt(JOptionPane.showInputDialog("Cuantos movimientos quieres hacer? "));
        
        for(int i = 0; i< contador;i++){
            char movimiento;
            movimiento = JOptionPane.showInputDialog("Ingrese el movmiento que quiere hacer, 'w' para ariba, 'a' para izquiera, 's' para abajo y 'd' para derecha.  ").charAt(0);
            if(movimiento =='w' ||movimiento =='W'){
                punto1.arriba();
            }
            if(movimiento =='a' ||movimiento =='A'){
                punto1.izquierda();
            }
            if(movimiento =='s' ||movimiento =='S'){
                punto1.abajo();
            }
            if(movimiento =='d' ||movimiento =='D'){
                punto1.derecha();
            }
        }
        punto1.posicionFinal();
    
    }
        
}
