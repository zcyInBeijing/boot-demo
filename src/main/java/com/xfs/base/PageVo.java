package com.xfs.base;

import lombok.Data;

/**
 * 分页参数
 *
 * @author zhuchunyang
 * @date 2020/10/26 13:59
 */
@Data
public class PageVo {
    private Integer pageSize;

    private Integer pageNum;
}
