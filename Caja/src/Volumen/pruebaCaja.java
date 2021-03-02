package Volumen;

import java.util.Scanner;

public class pruebaCaja {
    public static void main(String[] args){
        var consola = new Scanner(System.in);
        
        Caja caja1 = new Caja();
        System.out.println("Bienvenido proporcione los siguientes datos");
        System.out.println("Alto: ");
        caja1.alto = Integer.parseInt(consola.nextLine());
        System.out.println("Ancho: ");
        caja1.ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Profundo: ");
        caja1.profundo = Integer.parseInt(consola.nextLine());
        int resultado = caja1.calcularVolumen(); 
        System.out.println("Resultado con constructor vacio");
        System.out.println("Volumen = " + resultado);
        Caja caja2 = new Caja(caja1.alto, caja1.ancho, caja1.profundo);
        resultado = caja2.calcularVolumen();
        System.out.println("Resultado con constructor con 3 Argumentos");
        System.out.println("Volumen = " + resultado);
    }
    
}
