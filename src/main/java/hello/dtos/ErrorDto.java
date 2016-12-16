package hello.dtos;

/**
 * Created by guojing on 2016/12/16.
 */
public class ErrorDto {
    private int code;
    private String msg;

    public ErrorDto(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
