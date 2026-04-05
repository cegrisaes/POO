public class Main {
    public static void main(String[] args) {
        DiasDeLaSemana day = DiasDeLaSemana.DOMINGO;

        if(day.getEsFinDeSemana()){
            System.out.println("Fin de semana.");
        } else {
            System.out.println("Día de la semana.");
        }

        for (DiasDeLaSemana dia:DiasDeLaSemana.values()){
            System.out.println(dia);
        }
    }
}
