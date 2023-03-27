/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Tema1 {

    public static void main(String[] args) {
       /* var condicion = false;
        if(condicion == true){
            System.out.println("La variable es verdadera");
        }
        else{
            System.out.println("La variable es falsa");
        }*/
    
    //CONVIRTIENDO NUMEROS A LETRAS
    var numero =3;
    var numeroTexto= "Numero desconocido";
    if(numero==1){
        numeroTexto="Numero uno";
    }
    else if(numero==2){
        numeroTexto="Numero dos";
    }
    
    else if(numero==3){
        numeroTexto="Numero tres";
    }
    else{
        numeroTexto="Fuera de rango";
    }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
