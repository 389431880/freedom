package com.freedom.foundationClient.rest.impl;

import com.freedom.foundationClient.dao.constant.SystemConstant;
import com.freedom.foundationClient.rest.interfaces.MeansController;
import com.freedom.foundationDb.dao.dto.MeansSpreadDTO;
import com.freedom.foundationDb.service.MeansService;
import com.freedom.freedomCore.annotation.LoginRequired;
import com.freedom.freedomCore.model.SimpleDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 10:32 2019/11/4
 */
@Slf4j
@RestController
@RequestMapping(value = SystemConstant.BASE_REQUEST_MAPPING)
public class MeansControllerImpl implements MeansController {

    /**
     * 资产Service
     */
    @Autowired
    private MeansService meansService;


    @Override
    @LoginRequired
    @GetMapping(value = PATH_GET_MINE_MEANS)
    public SimpleDTO<List<MeansSpreadDTO>> getMineMeans(//@CurrentUser UserInfo userInfo
    ) {



        return null;
    }

}
