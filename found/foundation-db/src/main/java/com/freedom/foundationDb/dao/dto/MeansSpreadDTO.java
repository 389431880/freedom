package com.freedom.foundationDb.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: HZB
 * @Description:
 * @Date: Created in 9:24 2019/11/4
 */
@Data
@ApiModel(description = "资产分布DTO")
public class MeansSpreadDTO {

    /**
     * id
     */
    @ApiModelProperty(value = "id", name = "id", example = "1")
    private Integer id;

    /**
     * 项目代码
     */
    @ApiModelProperty(value = "项目代码", name = "progressCode", example = "01")
    private String progressCode;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称", name = "progressName", example = "A股")
    private String progressName;

    /**
     * 成本占比
     */
    @ApiModelProperty(value = "成本占比", name = "cost", example = "70.00")
    private BigDecimal cost;

    /**
     * 持仓收益率
     */
    @ApiModelProperty(value = "持仓收益率", name = "income", example = "70.00")
    private BigDecimal income;

    /**
     * 产品分布
     */
    @ApiModelProperty(value = "产品分布", name = "foundationSpreadDTOList")
    private List<FoundationSpreadDTO> foundationSpreadDTOList;

}
