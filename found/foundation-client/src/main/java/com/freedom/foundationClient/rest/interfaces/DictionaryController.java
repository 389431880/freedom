package com.freedom.foundationClient.rest.interfaces;

import io.swagger.annotations.Api;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 10:42 2019/11/1
 */
@Api(tags = {"dictionary-controller"}, description = "字典项服务")
public interface DictionaryController {

    /**
     * 查询字典列表
     */
    String PATH_GET_LIST_DICTIONARY = "/dictionary/getListDictionary";


    /**
     * 查询字典列表
     * @return SimpleDTO<List<TEhMenuDTO>>
     */
//    @ApiOperation(value = "查询字典列表", notes = "查询字典列表", protocols = "http,https", httpMethod = "GET")
//    SimpleDTO<List<MenuDTO>> getMenusByUser();

}
