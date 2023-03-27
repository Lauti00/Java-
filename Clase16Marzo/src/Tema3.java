
public class Tema3 {

    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La variable es verdadera");
        } else {
            System.out.println("La variable es falsa");
        }
        
        var edad =10;
        if(edad>=18){
            System.out.println("La persona es mayor de edad");
        }
        else{
            System.out.println("La persona no es mayor de edad");
        }
    }

}
