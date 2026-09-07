public class Ejemplo1 {
    public static void main(String[] args) {
        Object dato = 2000;

        String mensaje = switch (dato){
            case Integer i when i > 1000 -> i + " es un entero mayor que 1000";
            case Integer i when i > 0 -> i + " es un entero mayor que cero";
            case Integer i -> i + " es entero";
            case String s when s.length() > 5 -> s + " es un String con más de 5 caracteres";
            case String s -> s + " es un String";
            case Double d -> d + " es un Double";
            case Long l -> l + " es un Long";
            default -> "Es otro tipo";
        };

        System.out.println(mensaje);
    }
}

