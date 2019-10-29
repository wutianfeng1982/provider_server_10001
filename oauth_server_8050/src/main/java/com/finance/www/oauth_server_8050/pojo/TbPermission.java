package com.finance.www.oauth_server_8050.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbPermission implements Serializable {
    private Long id;

    /**
    * 父权限
    */
    private Long parentId;

    /**
    * 权限名称
    */
    private String name;

    /**
    * 权限英文名称
    */
    private String enname;

    /**
    * 授权路径
    */
    private String url;

    /**
    * 备注
    */
    private String description;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}