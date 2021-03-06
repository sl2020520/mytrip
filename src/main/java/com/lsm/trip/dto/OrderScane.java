package com.lsm.trip.dto;

/**
 * Created by lv on 2017/5/8.
 */
public class OrderScane {
    private Integer order_id;
    private UserShowInfo dzUser;
    private Integer dzuid;
    private Integer ykuid;
    private Integer sid;
    private UserShowInfo ykUser;
    private UserScane userScane;
    private String travleTime;
    private String posttime;
    private Integer status;
    private Integer isReadMess;
    private String liabilityname;//存储安全责任书的名字
    private Integer dzUpload;
    private Integer ykUpload;

    public String getLiabilityname() {
        return liabilityname;
    }

    public void setLiabilityname(String liabilityname) {
        this.liabilityname = liabilityname;
    }

    public Integer getDzUpload() {
        return dzUpload;
    }

    public void setDzUpload(Integer dzUpload) {
        this.dzUpload = dzUpload;
    }

    public Integer getYkUpload() {
        return ykUpload;
    }

    public void setYkUpload(Integer ykUpload) {
        this.ykUpload = ykUpload;
    }

    public Integer getIsReadMess() {
        return isReadMess;
    }

    public void setIsReadMess(Integer isReadMess) {
        this.isReadMess = isReadMess;
    }

    public String getPosttime() {
        return posttime;
    }

    public void setPosttime(String posttime) {
        this.posttime = posttime;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getDzuid() {
        return dzuid;
    }

    public void setDzuid(Integer dzuid) {
        this.dzuid = dzuid;
    }

    public Integer getYkuid() {
        return ykuid;
    }

    public void setYkuid(Integer ykuid) {
        this.ykuid = ykuid;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public UserShowInfo getDzUser() {
        return dzUser;
    }

    public void setDzUser(UserShowInfo dzUser) {
        this.dzUser = dzUser;
    }

    public UserShowInfo getYkUser() {
        return ykUser;
    }

    public void setYkUser(UserShowInfo ykUser) {
        this.ykUser = ykUser;
    }

    public UserScane getUserScane() {
        return userScane;
    }

    public void setUserScane(UserScane userScane) {
        this.userScane = userScane;
    }

    public String getTravleTime() {
        return travleTime;
    }

    public void setTravleTime(String travleTime) {
        this.travleTime = travleTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
