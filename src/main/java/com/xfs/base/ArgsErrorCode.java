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
            put(ArgsErrorCode.ERROR_30001,"部门OA-ID不能为空");
            put(ArgsErrorCode.ERROR_30002,"用户状态类型错误");
            put(ArgsErrorCode.ERROR_30003,"用户在职状态类型错误");
            put(ArgsErrorCode.ERROR_30004,"用户ID错误");
            put(ArgsErrorCode.ERROR_30005,"账号长度错误");
            put(ArgsErrorCode.ERROR_30006,"OA-ID长度错误");
            put(ArgsErrorCode.ERROR_30007,"查询标志不能为空");
            put(ArgsErrorCode.ERROR_30008,"查询标志只能是0/1");
            put(ArgsErrorCode.ERROR_30009,"系统编码不能为空");
            put(ArgsErrorCode.ERROR_30010,"渠道编码不能为空");
            put(ArgsErrorCode.ERROR_30011,"药店编码不能为空");
            put(ArgsErrorCode.ERROR_30012,"启用状态不能为空");
            put(ArgsErrorCode.ERROR_30013,"机构标识不能为空");
            put(ArgsErrorCode.ERROR_30014,"销售类型不能为空");
            put(ArgsErrorCode.ERROR_30015,"销售区域不能为空");
            put(ArgsErrorCode.ERROR_30016,"商品标识不能为空");
            put(ArgsErrorCode.ERROR_30017,"商品编码不能为空");
            put(ArgsErrorCode.ERROR_30018,"操作人不能为空");
            put(ArgsErrorCode.ERROR_30019,"数据重复！");
            put(ArgsErrorCode.ERROR_30020,"药店标识不能为空！");
            put(ArgsErrorCode.ERROR_30021,"查询类型错误，且不能为空字符串！");
            put(ArgsErrorCode.ERROR_30022,"渠道编码长度错误！");
            put(ArgsErrorCode.ERROR_30023,"药店编码长度错误！");
            put(ArgsErrorCode.ERROR_30024,"药店标识长度错误！");
            put(ArgsErrorCode.ERROR_30025,"商品编码长度错误！");
            put(ArgsErrorCode.ERROR_30026,"商品标识长度错误！");
            put(ArgsErrorCode.ERROR_30027,"机构编码标识长度错误！");
            put(ArgsErrorCode.ERROR_30028,"操作人长度错误！");
            put(ArgsErrorCode.ERROR_30029,"状态只能是0或者1");
            put(ArgsErrorCode.ERROR_30030,"销售类型只能是0或者1");
            put(ArgsErrorCode.ERROR_30031,"销售区域只能是整数");
            put(ArgsErrorCode.ERROR_30032,"药店标识不能为空");
            put(ArgsErrorCode.ERROR_30033,"查询时间格式必须为时间戳");
            put(ArgsErrorCode.ERROR_30034,"渠道名称不能为空");
            put(ArgsErrorCode.ERROR_30035,"渠道名称长度错误");
            put(ArgsErrorCode.ERROR_30036,"上级编码长度错误");
            put(ArgsErrorCode.ERROR_30037,"手机号不能为空");
            put(ArgsErrorCode.ERROR_30038,"账号不能为空");
            put(ArgsErrorCode.ERROR_30039,"姓名不能为空");
            put(ArgsErrorCode.ERROR_30040,"手机号长度错误");
            put(ArgsErrorCode.ERROR_30041,"账号长度错误");
            put(ArgsErrorCode.ERROR_30042,"姓名长度错误");
            put(ArgsErrorCode.ERROR_30043,"渠道编码重复");
            put(ArgsErrorCode.ERROR_30044,"货主来源不能为空");
            put(ArgsErrorCode.ERROR_30045,"合作主体ID不能为空");
            put(ArgsErrorCode.ERROR_30046,"合作主体ID长度错误");
            put(ArgsErrorCode.ERROR_30047,"渠道状态只能是0,1,2");
            put(ArgsErrorCode.ERROR_30048,"资质类型只能是0或者1");
            put(ArgsErrorCode.ERROR_30050,"合作主体已存在,不能重复添加");
            put(ArgsErrorCode.ERROR_30051,"渠道类型只能是1,2,3");
        }
    } ;

    /**
     * 部门OA-ID不能为空！
     */
    public static final int ERROR_30001 = 30001;
    /**
     * 用户状态类型错误
     */
    public static final int ERROR_30002 = 30002;
    /**
     * 用户在职状态类型错误
     */
    public static final int ERROR_30003 = 30003;
    /**
     * 用户ID错误
     */
    public static final int ERROR_30004 = 30004;
    /**
     * 账号长度错误
     */
    public static final int ERROR_30005 = 30005;
    /**
     * OA-ID长度错误
     */
    public static final int ERROR_30006 = 30006;
    /**
     * 查询标志空
     */
    public static final int ERROR_30007 = 30007;
    /**
     * 查询标志错误
     */
    public static final int ERROR_30008 = 30008;
    /**
     * 系统编码不能为空
     */
    public static final int ERROR_30009 = 30009;
    /**
     * 渠道编码不能为空
     */
    public static final int ERROR_30010 = 30010;
    /**
     * 药店编码不能为空
     */
    public static final int ERROR_30011 = 30011;
    /**
     * 启用状态不能为空
     */
    public static final int ERROR_30012 = 30012;
    /**
     * 机构标识不能为空
     */
    public static final int ERROR_30013 = 30013;
    /**
     * 销售类型不能为空
     */
    public static final int ERROR_30014 = 30014;
    /**
     * 销售区域不能为空
     */
    public static final int ERROR_30015 = 30015;
    /**
     * 商品标识不能为空
     */
    public static final int ERROR_30016 = 30016;
    /**
     * 商品编码不能为空
     */
    public static final int ERROR_30017 = 30017;
    /**
     * 操作人不能为空
     */
    public static final int ERROR_30018 = 30018;
    /**
     * 数据重复
     */
    public static final int ERROR_30019 = 30019;
    /**
     * 药店标识不能为空
     */
    public static final int ERROR_30020 = 30020;
    /**
     * 查询类型错误
     */
    public static final int ERROR_30021 = 30021;
    /**
     * 渠道编码长度错误
     */
    public static final int ERROR_30022 = 30022;
    /**
     * 药店编码长度错误
     */
    public static final int ERROR_30023 = 30023;
    /**
     * 药店标识长度错误
     */
    public static final int ERROR_30024 = 30024;
    /**
     * 商品编码长度错误
     */
    public static final int ERROR_30025 = 30025;
    /**
     * 商品标识长度错误
     */
    public static final int ERROR_30026 = 30026;
    /**
     * 机构编码标识长度错误
     */
    public static final int ERROR_30027 = 30027;
    /**
     * 操作人长度错误
     */
    public static final int ERROR_30028 = 30028;
    /**
     * 状态只能是0或者1
     */
    public static final int ERROR_30029 = 30029;
    /**
     * 销售类型只能是0或者1
     */
    public static final int ERROR_30030 = 30030;
    /**
     * 销售区域只能是整数
     */
    public static final int ERROR_30031 = 30031;
    /**
     * 药店标识不能为空
     */
    public static final int ERROR_30032 = 30032;

    /**
     * 查询时间格式不正确
     */
    public static final int ERROR_30033 = 30033;

    /**
     * 渠道名称不能为空
     */
    public static final int ERROR_30034 = 30034;

    /**
     * 渠道名称长度错误
     */
    public static final int ERROR_30035 = 30035;

    /**
     * 上级编码长度错误
     */
    public static final int ERROR_30036 = 30036;

    /***
     * 手机号不能为空
     */
    public static final int ERROR_30037 = 30037;

    /***
     * 账号不能为空
     */
    public static final int ERROR_30038 = 30038;

    /***
     * 姓名不能为空
     */
    public static final int ERROR_30039 = 30039;

    /***
     * 手机号长度错误
     */
    public static final int ERROR_30040 = 30040;

    /***
     * 账号长度错误
     */
    public static final int ERROR_30041 = 30041;

    /***
     * 姓名长度错误
     */
    public static final int ERROR_30042 = 30042;

    /***
     * 渠道编码重复
     */
    public static final int ERROR_30043 = 30043;

    /***
     * 上级编码不能为空
     */
    public static final int ERROR_30044 = 30044;

    /***
     * 合作主题id不能为空
     */
    public static final int ERROR_30045 = 30045;

    /***
     * 合作主题id长度错误
     */
    public static final int ERROR_30046 = 30046;

    /***
     * 渠道状态只能是1,2,0
     */
    public static final int ERROR_30047 = 30047;

    /***
     * 资质类型只能是0或者1
     */
    public static final int ERROR_30048 = 30048;

    /***
     * 渠道状态只能是1,2,0
     */
//    public static final int ERROR_30049 = 30049;

    /***
     * 合作主体ID重复
     */
    public static final int ERROR_30050 = 30050;

    /***
     * 渠道类型只能是1,2,3
     */
    public static final int ERROR_30051 = 30051;

}
