package Throw;

public class Vote extends RuntimeException {
    Vote(String msg){
        super(msg);
    }
}
