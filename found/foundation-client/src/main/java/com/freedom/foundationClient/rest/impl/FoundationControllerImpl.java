package com.freedom.foundationClient.rest.impl;

import com.freedom.foundationClient.dao.constant.SystemConstant;
import com.freedom.foundationClient.rest.interfaces.FoundationController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 11:00 2019/11/1
 */
@Slf4j
@RestController
@RequestMapping(value = SystemConstant.BASE_REQUEST_MAPPING)
public class FoundationControllerImpl implements FoundationController {
}
