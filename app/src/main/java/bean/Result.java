package bean;

import java.util.List;

/**
 * Created by WeiYuan on 2017/8/29.
 */

class Result {
    /**
     * code : 200
     * page : 1
     * total : 0
     * msg : ERRMSG.COMMON.SUCCESS_CODE
     * data :
     * msgData : []
     */

    private int code;
    private int page;
    private int total;
    private String msg;
    private String data;
    private List<?> msgData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<?> getMsgData() {
        return msgData;
    }

    public void setMsgData(List<?> msgData) {
        this.msgData = msgData;
    }
}
