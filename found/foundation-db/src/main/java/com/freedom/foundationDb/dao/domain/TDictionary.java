package com.freedom.foundationDb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author: HZB
 * @Description: 字典表
 * @Date: Created in 16:59 2019/10/31
 */
@Table(name = "t_dictionary")
@Data
public class TDictionary {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 项目代码
     */
    @Column(name = "progress_code")
    private String progressCode;

    /**
     * 项目名称
     */
    @Column(name = "progress_name")
    private String progressName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 是否可用1是0否
     */
    private Boolean enabled;

    /**
     * 删除标示1删除0未删除
     */
    private Boolean deleted;

    /**
     * 备注
     */
    private String remark;

}
