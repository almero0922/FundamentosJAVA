
package Volumen;

public class Caja {
    int ancho, alto, profundo;
    
    public Caja(){
        
    }
    
    public Caja(int a, int al, int pro){
        this.ancho = a;
        this.alto = al;
        this.profundo = pro;
    }
    
    public int calcularVolumen(){
        // Se retorna el resultado del volumen;
        return ancho * alto * profundo;
    }
    
}
