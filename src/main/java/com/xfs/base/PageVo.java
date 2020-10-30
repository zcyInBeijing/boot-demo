package com.xfs.base;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * 分页参数
 *
 * @author zhuchunyang
 * @date 2020/10/26 13:59
 */
@Data
public class PageVo {
    private Integer pageSize;

    @Range(min = 0,max = 5,message = "最小0，最大5")
    private Integer pageNum;
}
