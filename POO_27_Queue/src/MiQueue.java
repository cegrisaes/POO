import java.util.ArrayList;

public class MiQueue<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public void offer(T elemento){
        elementos.add(elemento);
    }

    public T peek(){
        if(isEmpty()){
            return null;
        }

        return elementos.get(0);
    }

    public T poll(){
        if(isEmpty()){
            return null;
        }

        return elementos.remove(0);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
