package Exceptions.CheckedUnchecked;

public class MinhaExceção extends RuntimeException {
    
    public MinhaExceção(){
    }

    public MinhaExceção(String msg) {
        super(msg);
    }
    
}
