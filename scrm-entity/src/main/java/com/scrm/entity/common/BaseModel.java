package com.scrm.entity.common;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author liuKevin
 * @date 2021年09月26日 16:46
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BaseModel implements Serializable {

    /**
     * 主键Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 企业Id
     */
    private String corpId;

    /**
     * 删除标示
     * 0: 正常, 1: 删除
     *
     * @see com.scrm.entity.enums.BaseModelDelFlagEnum
     */
    @TableLogic(value = "0", delval = "1")
    private String delFlag;

    /**
     * 删除时间戳
     */
    private Long deleteTimestamp;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改人
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    /**
     * 修改时间
     */
    private String updateTime;

}
