package geektime.pattern.five;

public class IdGenerator {
    private  IdGenerator(){

    }
    private static IdGenerator instance=new IdGenerator();

    public static IdGenerator getInstance(){
        return instance;
    }
    public String generate(){
        return "";
    }
}
