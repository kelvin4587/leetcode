package geektime.pattern.five;

public class InvalidAmountException extends RuntimeException {
    private String name;
    public InvalidAmountException(String name){
        this.name=name;
    }
}
