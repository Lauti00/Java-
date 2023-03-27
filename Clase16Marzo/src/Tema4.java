
import java.util.Scanner;


public class Tema4 {
    public static void main(String[] args) {
        var edad= Integer.parseInt("20"); //convierto un string a entero
        System.out.println("edad = " + edad);
    
        var valorPi=Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
    
        var consola= new Scanner(System.in);
//        System.out.println("Proporciona un numero");
//        edad=Integer.parseInt(consola.nextLine());
//        System.out.println("consola = " + consola);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto); //CONVIERTO UN NUMERO EN TEXTO
    
        var caracter="hola".charAt(1); //IMPRIMO LA O DE HOLA DE ACUERDO AL NUMERO
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporcione un caracter:");
        caracter =consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    
    
    }
    
}
