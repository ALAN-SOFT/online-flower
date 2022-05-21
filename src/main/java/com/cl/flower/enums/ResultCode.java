package com.cl.flower.enums;

import java.util.ArrayList;
import java.util.List;

public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(1, "成功"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 用户错误：20001-29999*/
    USER_NOT_SIGN_IN(20001, "用户未登录"),
    USER_PASSWORD_ERROR(20002, "密码错误"),
    USER_ACCOUNT_ERROR(20003, "账号不存在"),
    USER_VERIFY_CODE_ERROR(20004, "验证码错误"),
    USER_ACCOUNT_FORBIDDEN(20005, "账号已被禁用"),
    USER_NOT_EXIST(20006, "用户不存在"),
    USER_HAS_EXISTED(20007, "用户已存在"),
    USER_USERNAME_EXIST(20007, "用户名已存在"),
    USER_SIGN_UP_FAILURE_(20008, "用户注册失败"),
    USER_DELETE_FAILURE_(20009, "用户注销失败"),
    USER_SELECT_FAILURE_(20010, "用户查询失败"),
    USER_UPDATE_FAILURE_(20011, "用户信息更新失败"),
    USER_CONFIRM_FAILURE_(20012, "用户关系查询失败"),
    USER_MOBILE_EXIST_(20013,"该用户已存在"),
    USER_VERIFY_CODE_ERROR_(20014,"验证码输入错误"),
    USER_LOGIN_PASSWORD_ERROR(20015,"密码错误"),
    USER_MOBILE_ERROR(20016,"手机号格式错误"),
    USER_CODE_NONSEXIST(20017,"验证码未发送或已经失效"),
    USER_UPDATE_AVATAR_FAILURE(20017,"用户头像更新失败"),
    RELATIONSHIP_UPDATE_STATUS(20018,"处理好友请求失败"),
    USER_ACCOUNT_PASSWORD(20100,"账号或者密码错误"),

    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题"),
    SPECIFIED_RECORD_FAIL(30002,"打卡失败"),
    SPECIFIED_DELETE_FAIL(30003,"删除失败"),
    SPECIFIED_UPDATE_FAIL(30003,"更新失败"),
    SPECIFIED_EMAIL_FAIL(30004,"邮件发送失败"),
    SPECIFIED_INSERT_FAIL(30005,"新增失败"),
    SPECIFIED_INSERT_Re_FAIL(30006,"表中openId冲突"),


    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),
    SYSTEM_ISABLE_ERROR(40002, "账号未激活,联系高级管理员"),
    SYSTEM_SUCCESS(40003,"分配已完成"),
    SYSTEM_NO_WORK(40004,"该地区无工人"),


    /* 数据错误：50001-599999 */
    RESULT_CODE_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),
    DATA_TEACHER_NONE(50004,"数据获取出错"),
    DATA_TEACHER_OUT(50005,"最后一页"),
    DATA_TEACHER_NONEA(50006, "没有已读数据"),
    DATA_TEACHER_NON(50007, "没有更多数据了"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限"),

    /* 日志错误：80001-89999 */
    LOG_SELECT_ERROR(80001,"日志查询出错"),
    LOG_UPDATE_ERROR(80002,"日志更新出错"),


    /* 文件上传错误 */
    FILE_NOT_EXIST(90001,"文件未找到");

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }


    /**
     * 校验重复的code值
     *
     * @param args
     */
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}
