package com.wwt.managemail.exception;

import com.wwt.managemail.enums.ExceptionEnum;
import lombok.Getter;

@Getter
public class YbException extends RuntimeException {
    private int status;
    public YbException(ExceptionEnum em){
        super(em.getMessage());
        this.status=em.getStatus();
    }
    public YbException(ExceptionEnum em, String msg){
        super(msg);
        this.status=em.getStatus();
    }
    public YbException(ExceptionEnum em, Throwable cause){
        super(em.getMessage(),cause);
        this.status=em.getStatus();
    }
}
