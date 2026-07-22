import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MiStack<T>{
    private List<T> elementos = new ArrayList<>();

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public void push(T elemento){
        elementos.add(elemento);
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public String toString(){
        return elementos.toString();
    }
}
