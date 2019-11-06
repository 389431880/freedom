package com.freedom.foundationClient.rest.impl;

import com.freedom.foundationClient.dao.constant.SystemConstant;
import com.freedom.foundationClient.rest.interfaces.DictionaryController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 10:44 2019/11/1
 */
@Slf4j
@RestController
@RequestMapping(value = SystemConstant.BASE_REQUEST_MAPPING)
public class DictionaryControllerImpl implements DictionaryController {
}
