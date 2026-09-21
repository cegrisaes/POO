public class Ejemplo {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "Mendoza", 12345, 35);
        Usuario usuario2 = new Usuario("Carlos", "Mendoza", 12345, 35);
        Usuario usuario3 = new Usuario("Laura", "Ramirez", 54321, 23);

        System.out.println(usuario1.nombre());
        System.out.println(usuario1.apellido());

        System.out.println(usuario1);

        System.out.println(usuario1.equals(usuario2));
        System.out.println(usuario1.equals(usuario3));

        System.out.println(usuario1.nombreAMayusculas());

        System.out.println(Usuario.NOMBRE_POR_DEFECTO);
        Usuario.unMetodoEstatico();
    }
}
