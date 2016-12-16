package hello.exceptions;

/**
 * Created by guojing on 2016/12/16.
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException(String msg){
        super(msg);
    }

    public NotFoundException(){
        super();
    }
}
