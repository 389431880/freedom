package com.freedom.freedomCore.config.exception;

import com.freedom.freedomCore.constant.CodeEnum;
import lombok.Data;

/**
 * @ClassName wxy
 * @Description TODO
 * @Author admin
 * @Date 2019/1/21 18:02
 * @Version 1.0.0
 **/
@Data
public class IDriveException extends RuntimeException {

    private String code;

    private String message;

    private boolean success = false;

    public IDriveException(CodeEnum codeEnum){
        super(codeEnum.message());
        this.code = codeEnum.code();
    }

    public IDriveException(String code, String message){
        this.code = code;
        this.message = message;
    }

}
