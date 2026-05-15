public class Ejemplo5 {
    public static void main(String[] args) {
        try{
            imprimirMensaje();
        }catch (NullPointerException npe){
            System.out.println("No se puede leer el tamaño de nombre, porque nombre tiene el valor null.");
        }
    }

    public static void imprimirMensaje(){
        String nombre = null;
        int numeroDeCaracteres = nombre.length();
        System.out.println(nombre + " tiene " + numeroDeCaracteres + " caracteres.");
    }
}
