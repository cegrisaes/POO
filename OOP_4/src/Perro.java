public class Perro {
    public String nombre;
    public String raza;

    public Perro(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro(String nombre){
        this.nombre = nombre;
        raza = "Cruzado";
    }

    public Perro(){
        nombre = "Sin nombre";
        raza = "Cruzado";
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println(nombre + ", de raza " + raza + " está ladrando: GUAUUU GUAUUU");
    }
}
