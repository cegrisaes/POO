public class Leon extends Animal implements Cazador{
    @Override
    public void hacerRuido(){
        System.out.println("Grrrrrr");
    }

    @Override
    public void acechar() {
        System.out.println("El león acecha.");
    }

    @Override
    public void cazar() {
        System.out.println("El león caza.");
    }
}
