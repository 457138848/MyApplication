package bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WeiYuan on 2017/8/29.
 */

public class Result {
    /**
     * code : 200
     * page : 1
     * total : 0
     * msg : ERRMSG.COMMON.SUCCESS_CODE
     * data :
     * msgData : []
     */
    public Result(){}

    public Result(int code){
        this.code = code;
        this.msg = new Integer(code).toString();
    }

    public Result(int code, Object data){
        this.code = code;
        this.msg = new Integer(code).toString();
        this.data = data;
    }

    public Result(int code, Object data, int page, int total){
        this.code = code;
        this.msg = new Integer(code).toString();
        this.data = data;
        this.page = page;
        this.total = total;
    }


    private int code;
    private int page = 1;
    private int total = 0;
    private String msg = "";
    private Object data = new ArrayList<>();
    private Object[] msgData ;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        this.msg = new Integer(code).toString();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object[] getMsgData() {
        return msgData;
    }

    public void setMsgData(Object[] msgData) {
        this.msgData = msgData;
    }

    public static Result buildSuccess(){
        return  new Result(200, "");
    }
    public static Result buildError(){
        return  new Result(100, "");
    }
}
