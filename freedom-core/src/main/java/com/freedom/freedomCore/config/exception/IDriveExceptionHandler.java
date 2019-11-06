package com.freedom.freedomCore.config.exception;

import com.freedom.freedomCore.model.RestDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName wxy
 * @Description TODO
 * @Author admin
 * @Date 2019/1/21 18:07
 * @Version 1.0.0
 **/
@ControllerAdvice
public class IDriveExceptionHandler {

    @ExceptionHandler(value = IDriveException.class)
    @ResponseBody
    public RestDTO handlerSellerException(IDriveException e){
        RestDTO restDTO = new RestDTO();
        restDTO.setCode(e.getCode());
        restDTO.setSuccess(false);
        restDTO.setMessage(e.getMessage());
        return restDTO;
    }

}
