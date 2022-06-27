package geektime.pattern.five;

public class InsufficientAmountException extends RuntimeException {
    private String name;
    public InsufficientAmountException(String name){
        this.name=name;
    }
}
