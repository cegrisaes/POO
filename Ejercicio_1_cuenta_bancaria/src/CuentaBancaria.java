public class CuentaBancaria {
    private String titular;
    private String numeroDeCuenta;
    private double saldo;

    private static final String TITULAR_POR_DEFECTO = "Desconocido";
    private static final String NUMERO_DE_CUENTA_POR_DEFECTO = "00000000";

    public CuentaBancaria(String titular, String numeroDeCuenta, double saldo){
        if(titular == null){
            System.out.println("El titular no puede ser null.");
            this.titular = TITULAR_POR_DEFECTO;
        }else if(titular == ""){
            System.out.println("El titular no puede ser un string vacío.");
            this.titular = TITULAR_POR_DEFECTO;
        }else{
            this.titular = titular;
        }

        if(numeroDeCuenta == null){
            System.out.println("El número de cuenta no puede ser null.");
            this.numeroDeCuenta = NUMERO_DE_CUENTA_POR_DEFECTO;
        }else if(numeroDeCuenta.length() != 8){
            System.out.println("El número de cuenta debe tener exactamente 8 caracteres.");
            this.numeroDeCuenta = NUMERO_DE_CUENTA_POR_DEFECTO;
        }else if(numeroDeCuenta.contains(" ")){
            System.out.println("El número de cuenta no puede contener espacios.");
            this.numeroDeCuenta = NUMERO_DE_CUENTA_POR_DEFECTO;
        }else{
            this.numeroDeCuenta = numeroDeCuenta;
        }

        if(saldo < 0){
            System.out.println("El saldo no puede ser negativo.");
            this.saldo = 0;
        }else{
            this.saldo = saldo;
        }
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if(titular == null){
            System.out.println("El titular no puede ser null.");
            return;
        }

        if(titular == ""){
            System.out.println("El titular no puede ser un string vacío.");
            return;
        }

        this.titular = titular;
    }

    public void depositar(double monto){
        if(monto > 0){
            saldo = saldo + monto;
        }else{
            System.out.println("El monto a depositar es inválido, porque debe ser mayor que 0.");
        }
    }

    public void retirar(double monto){
        if(monto <= saldo){
            saldo = saldo - monto;
        }else{
            System.out.println("El monto a retirar es inválido, porque debe ser menor o igual al saldo.");
        }
    }
}
