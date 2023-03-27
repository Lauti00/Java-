public class TipoByte {
    public static void main(String[] args) {
        byte numeroByte =(byte)127;
        System.out.println("numeroByte =" + numeroByte);
        System.out.println("Valor minimo byte:"+ Byte.MIN_VALUE); /*El Byte es una clase de java donde poniendo el . 
                                                                    voy accediendo a los distintos atributos y metodos*/
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
    
        short numeroShort = (short)32760;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de Short" + Short.MIN_VALUE);
        System.out.println("Valor maximo de Short" + Short.MAX_VALUE);
        
        int numeroInt=(int)245678;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El numero minimo de Int="+" "+ Integer.MIN_VALUE);
        System.out.println("El numero maximo de Int="+" "+ Integer.MAX_VALUE);
        
        long numeroLong= 2147483670L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El numero minimo de Long es ="+ " " +Long.MIN_VALUE);
        System.out.println("El numero maximo de Long es=" + " "+ Long.MAX_VALUE);
        
    }
}
