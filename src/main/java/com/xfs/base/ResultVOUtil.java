package com.xfs.base;

/**
 * @description: TODO
 * @author: zhucy
 * @create : 2019/5/5 15:01
 */
public class ResultVOUtil {
    /**
     * sucess 返回成功
     * @param t 数据
     * @return
     */
    public static<T> ResultVO<T> success(T t){
        ResultVO<T> vo = new ResultVO<T>(t);
        vo.setCode(ResultCodeEnum.REQUEST_OK.getCode());
        vo.setMsg(ResultCodeEnum.REQUEST_OK.getMsg());
        return vo;
    }

    /**
     * sucess 返回成功
     * @return
     */
    public static<T> ResultVO<T> success(){
        ResultVO<T> vo = new ResultVO<T>((T) null);
        vo.setCode(ResultCodeEnum.REQUEST_OK.getCode());
        vo.setMsg(ResultCodeEnum.REQUEST_OK.getMsg());
        return vo;
    }

    /**
     * businessSuccess 返回业务成功
     * @param t  数据信息
     * @param msg 自定义msg
     * @return
     */
    public static<T> ResultVO<T> businessSuccess(T t,String msg){
        ResultVO<T> vo = new ResultVO<T>(t);
        vo.setCode(ResultCodeEnum.REQUEST_OK.getCode());
        vo.setMsg(msg);
        return vo;
    }

    /**
     * error 返回错误信息
     * @return
     */
    public static<T> ResultVO<T> error(){
        ResultVO<T> vo = new ResultVO<T>((T) null);
        vo.setCode(ResultCodeEnum.SERVER_ERROR.getCode());
        vo.setMsg(ResultCodeEnum.SERVER_ERROR.getMsg());
        return vo;
    }

    /**
     * businessError 返回业务错误信息
     * @param msg 自定义msg
     * @return
     */
    public static<T> ResultVO<T> businessError(String msg){
        ResultVO<T> vo = new ResultVO<T>((T) null);
        vo.setCode(ResultCodeEnum.SERVER_ERROR.getCode());
        vo.setMsg(msg);
        return vo;
    }

    /**
     * businessError 返回业务失败
     * @param t  数据信息
     * @param msg 自定义msg
     * @return
     */
    public static<T> ResultVO<T> businessError(T t,String msg){
        ResultVO<T> vo = new ResultVO<T>(t);
        vo.setCode(ResultCodeEnum.SERVER_ERROR.getCode());
        vo.setMsg(msg);
        return vo;
    }

   public static<T> ResultVO<T> createResult(ResultCodeEnum code) {

        return new ResultVO<T>(code);
    }
    public static<T> ResultVO<T> createResult(ResultCodeEnum code,T t) {

        return new ResultVO<T>(code,t);
    }

    public static<T> ResultVO<T> createResult(int code,String msg) {

        return new ResultVO<T>(code,msg);
    }



}
