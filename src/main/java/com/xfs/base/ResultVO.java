package com.xfs.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

/**
 * @description: TODO
 * @author: zhucy
 * @create : 2019/5/5 14:57
 */
@ApiModel(description = "返回结果")
@ToString
public class ResultVO<T> {
    @ApiModelProperty(value = "返回编码",name = "code")
    private Integer code;
    @ApiModelProperty(value = "返回信息",name = "msg")
    private String msg;
    @ApiModelProperty(value = "返回对象",name = "result")
    private T result;

    public ResultVO(T result){
        this(ResultCodeEnum.REQUEST_OK,result);
    }

    public ResultVO(ResultCodeEnum resultCodeEnum, T result){
        this.result=result;
        this.code=resultCodeEnum.getCode();
        this.msg=resultCodeEnum.getMsg();
    }

    public ResultVO(Integer code, String message){
        this.code=code;
        this.msg=message;
    }

   public ResultVO(Integer code, String message, T result){
       this.result=result;
       this.code=code;
        this.msg=message;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static<T> ResultVO<T> createSuccess(T result){
        return new ResultVO(result);
    }

    public boolean isOk(){
        return ResultCodeEnum.REQUEST_OK.getCode().equals(this.getCode());
    }

    public ResultVO(ResultCodeEnum status) {
        this.code = status.getCode();
        this.msg = status.getMsg();
        this.result = null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
