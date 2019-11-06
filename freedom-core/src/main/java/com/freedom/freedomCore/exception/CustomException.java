package com.freedom.freedomCore.exception;

import com.freedom.freedomCore.constant.CodeEnum;
import lombok.Data;

@Data
public class CustomException extends RuntimeException {

    private String code;

    private String message;

    private boolean success = false;

    public CustomException(CodeEnum codeEnum){
        super(codeEnum.message());
        this.code = codeEnum.code();
    }

    public CustomException(String code, String message){
        this.code = code;
        this.message = message;
    }

}
