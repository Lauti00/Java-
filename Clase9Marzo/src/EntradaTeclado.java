
import java.util.Scanner;


public class EntradaTeclado {

public static void main(String args[]){
    System.out.println("Escribe tu nombre:");
    Scanner consola = new Scanner(System.in); //Instancia de la clase , ESTAMOS CREANDO UN OBJETO
    var usuario = consola.nextLine();
    System.out.println("usuario = " + usuario); //ATAJO SOUTV
    System.out.println("Escribe tu titulo");
    var titulo = consola.nextLine();
    System.out.println("Resultado "+ " " + titulo + " "+ usuario);
    System.out.println("Ingrese el el titulo del libro");
    var titulo2=consola.nextLine();
    System.out.println("Ingrese el autor del libro");
    var autor = consola.nextLine();
    System.out.println("El titulo del libro es" + titulo2 + "El autor es" + autor);
}    
}
