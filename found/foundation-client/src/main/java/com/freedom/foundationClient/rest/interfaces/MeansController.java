package com.freedom.foundationClient.rest.interfaces;

import com.freedom.foundationDb.dao.dto.MeansSpreadDTO;
import com.freedom.freedomCore.model.SimpleDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 10:31 2019/11/4
 */
@Api(tags = {"means-controller"}, description = "资产服务")
public interface MeansController {

    /**
     * 查询个人资产分布
     */
    String PATH_GET_MINE_MEANS = "/means/getMineMeans";


    /**
     * 查询资产分布
     * @return SimpleDTO<List<MeansSpreadDTO>>
     */
    @ApiOperation(value = "查询个人资产分布", notes = "查询个人资产分布", protocols = "http,https", httpMethod = "GET")
    SimpleDTO<List<MeansSpreadDTO>> getMineMeans(//UserInfo userInfo
    );

}
