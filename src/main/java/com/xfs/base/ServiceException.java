package com.xfs.base;

/**
 * @description: 异常信息
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * 错误码  与resultVo 错误码同步
     */
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ServiceException(){
        super();
    }

    public ServiceException(String message){
        super(message);
        this.code=1;
    }
    public ServiceException(Integer code, String message){
        super(message);
        this.code=code;
    }

    public ServiceException(String message, Throwable throwable){
        super(message,throwable);
    }
    public ServiceException(Throwable throwable){
        super(throwable);
    }
}
