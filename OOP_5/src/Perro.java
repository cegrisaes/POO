public class Perro {
    public String nombre;
    public String raza;

    public Perro(String nombre, String raza){
        setNombre(nombre);
        setRaza(raza);
    }

    public Perro(String nombre){
        setNombre(nombre);
        setRaza("Cruzado");
    }

    public Perro(){
        setNombre("Sin nombre");
        setRaza("Cruzado");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre.trim().isEmpty()){
            System.out.println("El parámetro nombre no es válido");
            this.nombre = "Desconocido";
        }else{
            this.nombre = nombre;
        }
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        if(raza.trim().isEmpty()){
            System.out.println("El parámetro raza no es válido");
            this.raza = "Desconocida";
        }else{
            this.raza = nombre;
        }
    }

    public void ladrar(){
        System.out.println(nombre + ", de raza " + raza + " está ladrando: GUAUUU GUAUUU");
    }
}
