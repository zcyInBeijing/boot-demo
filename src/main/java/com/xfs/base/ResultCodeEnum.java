package com.xfs.base;

/**
 * @description: TODO
 * @author: zhucy
 * @create : 2019/5/5 14:58
 */
public enum ResultCodeEnum {
    REQUEST_OK(200, "请求成功"),
    SERVER_ERROR(500,"服务异常"),
    UNAUTHENTICATED(401,"未登录"),
    /*授权／令牌请求接口返回码*/
    UN_AUTHORIZED(10001, "未进行授权"),
    INVALID_REQUEST(10002, "非法的请求参数"),
    INVALID_CLIENT(10003, "用户认证失败"),
    INVALID_GRANT(10004, "非法的授权信息"),
    EXPRIED_TOKEN(10005, "提供的更新令牌已过期"),
    ACCESS_DENIED(10006, "用户或授权服务器拒绝授予数据访问权限"),
    TICKET_ISILLEGAL(10007,"Ticket不合法"),
    NOEXIST_USER(10008,"不存在的用户"),

    /*请求参数返回码*/
    NO_CONTENT(20001, "请求成功,但无返回内容"),
    ISV_MISSPARAMETER(20002, "缺少必选参数"),
    ISV_INVALIDPARAMETERS(20003, "请求参数无效"),
    TOOMANY_PARAMETERS(20004, "请求参数过多"),
    INVALID_OPERATION(20005, "无效的操作方法"),
    NOIllEGAL_FILRTYPE(20006,"不合法的文件类型"),
    NOIllEGAL_MENUTYPE (20007,"不合法的菜单类型"),
    NOINVALID_REQUESTCHARACTER(20008,"不合法的请求字符"),
    NOINVALID_URL(20009,"无效的url"),
    NOINVALID_REQUESTFORMAT(20010,"不合法的请求格式"),
    NOILLEGA_GROUPNAME(20011,"分组名字不合法"),
    BUTTONTYEP_ERROR(20012,"button 类型错误"),
    MISS_SUBMENUDATA(20013,"缺少子菜单数据"),
    API_TRYAGAIN(20014,"API调用太频繁,请稍候再试"),
    DATEFORMAT_ERROR(20015,"日期格式错误"),
    UPLOAD_FAILED(20016,"上传失败"),
    NOILLEGAL_SUBMENULEVEL(20017,"不合法的子菜单级数"),
    PARSEJSON_CONTENTERROR(20018,"解析JSON/XML内容错误"),
    INVALID_PARAMETER(20019,"参数错误"),
    UPLOADFILE_MISS(20020,"上传文件缺失"),
    TIMEINTERVAL_NOILLEGAL(20021,"时间区间不合法");

    private Integer code;
    private String msg;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
