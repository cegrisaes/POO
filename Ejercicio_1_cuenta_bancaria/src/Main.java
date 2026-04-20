public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Roberto Díaz", "12345678", 1000);
        System.out.println(cuenta.getSaldo());
    }
}
