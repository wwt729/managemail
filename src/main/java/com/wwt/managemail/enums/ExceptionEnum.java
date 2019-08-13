package com.wwt.managemail.enums;

public enum ExceptionEnum {

    DATA_TRANSFER_ERROR(500, "数据转换异常！"),
    SQL_RESULT_ERROR(500, "未查询出数据！"),
    PARAMS_ERROR(400, "参数错误！"),
    DELETE_ERROR(500,"删除失败");


    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ExceptionEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
