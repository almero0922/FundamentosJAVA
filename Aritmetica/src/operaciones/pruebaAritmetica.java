package operaciones;

public class pruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a =3;
        aritmetica1.b =2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 9);
        System.out.println(" Resultado usando argumentos = " +  resultado);
        
    }
    
}
