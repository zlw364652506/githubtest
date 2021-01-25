package com.aj.frame.auth.common.bean;


import com.aj.frame.beans.PagingInfo;
import org.springframework.http.HttpStatus;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回数据
 *
 * @author liuling
 * <p>
 * 2019年10月21日
 */
public class Result extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public static final String CODE_TAG = "errcode";

    public static final String MSG_TAG = "errmsg";

    public static final String DATA_TAG = "data";

    public static final String LIST_TAG = "dataList";

    public static final String PAGE_TAG = "pagingInfo";

    public Result() {
        put(CODE_TAG, 0);
        put(MSG_TAG, "success");
    }

    public static Result error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put(CODE_TAG, code);
        r.put(MSG_TAG, msg == null ? "业务处理异常" : msg);
        return r;
    }

    public static Result ok(String msg) {
        Result r = new Result();
        r.put(MSG_TAG, msg);
        return r;
    }

    public static Result ok(Object data) {
        Result r = new Result();
        r.put(DATA_TAG, data);
        return r;
    }

    public static Result ok(List dataList, PagingInfo pagingInfo) {
        Result r = new Result();
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put(LIST_TAG, dataList);
        map.put(PAGE_TAG, pagingInfo);
        r.put(DATA_TAG, map);
        return r;
    }

    public static Result ok(String msg, Object data) {
        Result r = new Result();
        r.put(MSG_TAG, msg);
        r.put(DATA_TAG, data);
        return r;
    }

    public static Result ok() {
        return new Result();
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
