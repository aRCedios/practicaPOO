package masbarato;
//Autor: Daniel Arce

import javax.swing.JOptionPane;
public class MasBarato {
    public static void main(String[] args) {
        String marca,modelo;
        float precio;
        int contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuántos vehiculos quiere: "));
        int indiceBarato;
        Vehiculos carro[] = new Vehiculos[contador];
        for(int i=0;i<contador;i++){
            marca = JOptionPane.showInputDialog("Ingrese la marca del carro #"+(i+1)+":");
            modelo = JOptionPane.showInputDialog("Ingrese el modelo del carro #"+(i+1)+":");
            precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del carro #"+(i+1)+":"));
            carro[i] = new Vehiculos(marca,modelo,precio);
            
        }
        indiceBarato = Vehiculos.indiceMasBarato(carro);
        JOptionPane.showMessageDialog(null,"El carro más barato es: "+carro[indiceBarato].mostrarDatos());
    }
    
    
}

