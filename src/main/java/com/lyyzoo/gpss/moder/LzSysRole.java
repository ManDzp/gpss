package com.lyyzoo.gpss.moder;

import java.util.Date;

public class LzSysRole {
    private Integer id;

    private String name;

    private String code;

    private String descs;

    private String menuids;

    private String menunames;

    private Integer state;

    private String updater;

    private Date updatime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs == null ? null : descs.trim();
    }

    public String getMenuids() {
        return menuids;
    }

    public void setMenuids(String menuids) {
        this.menuids = menuids == null ? null : menuids.trim();
    }

    public String getMenunames() {
        return menunames;
    }

    public void setMenunames(String menunames) {
        this.menunames = menunames == null ? null : menunames.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdatime() {
        return updatime;
    }

    public void setUpdatime(Date updatime) {
        this.updatime = updatime;
    }
}