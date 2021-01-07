package com.qy25.sm.common.http;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private String message;
    private int status;
    private T data;


    private AxiosResult() {
    }

    /**
     *封装数据公共方法
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> tAxiosResult = new AxiosResult<>();
        tAxiosResult.setData(data);
        tAxiosResult.setMessage(axiosStatus.getMessage());
        tAxiosResult.setStatus(axiosStatus.getStatus());
        return tAxiosResult;
    }

    /**
     * 成功不返回数据
     */
    public static<T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK,null);
    }
    /**
     * 成功返回数据
     */
    public static<T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK,data);
    }
    /**
     * 成功返回自定义状态
     */
    public static<T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }
    /**
     * 成功返回自定义状态并携带数据
     */
    public static<T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }

    /**
     * 失败不返回数据
     */
    public static<T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROR,null);
    }
    /**
     * 失败返回数据
     */
    public static<T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROR,data);
    }
    /**
     * 失败返回自定义状态
     */
    public static<T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }
    /**
     * 失败返回自定义状态并携带数据
     */
    public static<T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }



}
