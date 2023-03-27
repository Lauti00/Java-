
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese la descripcion");
        String descripcion=(consola.nextLine());
        
        System.out.println("Proporcione el id ");
        int idProducto =Integer.parseInt(scanner.nextLine());
        System.out.println("idProducto = " + idProducto);
        var precio =Double.parseDouble("145.88");
        System.out.println("precio = " + precio);
        boolean varEnvio=true;
        System.out.println("");
        
        if(varEnvio){
            System.out.println("El envio es gratis");
        }
        else{
            System.out.println("El envio no es gratis");
        }
    }
}
