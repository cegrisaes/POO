public class Programa2 {
    public static void main(String[] args) {
        String despedida = "¡Buenas noches, Rosa!";
        System.out.println(despedida.length());
        System.out.println(despedida.contains("noche"));
        System.out.println(despedida.contains("dia"));
        System.out.println("     Hola            ".trim());
        System.out.println(despedida.toLowerCase());
        System.out.println(despedida.toUpperCase());
        System.out.println(despedida.replace("Rosa", "Laura"));
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("Hasta pronto".isBlank());
    }
}
