package net.greatsoft.bjjj.Exception;

public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 194906846739586856L;

    protected Integer code;

    protected String message;

    // protected ResultCode resultCode;

    protected Object data;

    public BusinessException() {
        super();
    }




}
