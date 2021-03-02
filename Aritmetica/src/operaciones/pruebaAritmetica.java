package operaciones;

public class pruebaAritmetica {
    public static void main(String[] args) {
       Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica1.a:  = " + aritmetica1.a );
        System.out.println("Aritmetica1.b = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
            System.out.println ("aritmetica = " + aritmetica2.a);
            System.out.println("aritmetica2 = " + aritmetica2.b);
            
        }
        
    }
    

