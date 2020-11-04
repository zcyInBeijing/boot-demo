package com.xfs.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 参数验证错误码定义
 * @author zhuchunyang
 */
public class ArgsErrorCode {

    public static final Map<Integer,String> errorMsgMap = new HashMap(){
        {
            put(ArgsErrorCode.ERROR_30001,"参数不能为空");
        }
    } ;

    /**
     * 参数不能为空
     */
    public static final int ERROR_30001 = 30001;


}
