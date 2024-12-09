
package punto2;
/*
 aRCee
*/
public class Punto {
    private int x,y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void derecha(){
        this.x +=1;
        
    }
    public void izquierda(){
        this.x -=1;
        
    }
    public void arriba(){
        this.y +=1;
    }
    public void abajo(){
        this.y -=1;
    }

    public void posicionFinal(){
        System.out.println("La posicion final es: ("+x+","+y+")");
    
    }
}
