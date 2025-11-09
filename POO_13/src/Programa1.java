public class Programa1 {
    public static void main(String[] args) {
        int[] edades = new int[5];
        double[] alturas = new double[4];
        for(int i = 0; i < edades.length; i++){
            edades[i] = 2 * i;
        }

        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }
        System.out.println();

        for(int edad:edades){
            System.out.println(edad);
        }
        double[] precios = {2.5, 4.6, 7.8, 10.14};
        System.out.println();
        System.out.println(precios.length);

        for(double precio:precios){
            System.out.println(precio);
        }

        System.out.println(edades);
        System.out.println(precios);
    }
}
