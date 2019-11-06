package com.freedom.freedomCore.exception;

import com.freedom.freedomCore.model.RestDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public RestDTO handlerSellerException(CustomException e){
        RestDTO restDTO = new RestDTO();
        restDTO.setCode(e.getCode());
        restDTO.setSuccess(false);
        restDTO.setMessage(e.getMessage());
        return restDTO;
    }

}
