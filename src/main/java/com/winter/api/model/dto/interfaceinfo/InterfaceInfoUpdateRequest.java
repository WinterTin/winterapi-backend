package com.winter.api.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    /**
     * 接口ID
     */
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口URL地址
     */
    private String url;

    /**
     * 接口请求类型
     */
    private String method;

    /**
     * 请求头
     */
    private String requestHeader ;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口发布状态，0——已发布，1——未发布
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}