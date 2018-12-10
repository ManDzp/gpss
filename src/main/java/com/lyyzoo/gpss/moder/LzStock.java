package com.lyyzoo.gpss.moder;

import java.math.BigDecimal;
import java.util.Date;

public class LzStock {
    private Integer id;

    private Integer goodsid;

    private Integer repoid;

    private Integer totalcount;

    private Integer salecount;

    private BigDecimal buyprice;

    private BigDecimal avgbuyprice;

    private BigDecimal saleprice;

    private BigDecimal totalbuyprice;

    private BigDecimal totalsaleprice;

    private Date updatime;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getRepoid() {
        return repoid;
    }

    public void setRepoid(Integer repoid) {
        this.repoid = repoid;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public Integer getSalecount() {
        return salecount;
    }

    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }

    public BigDecimal getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(BigDecimal buyprice) {
        this.buyprice = buyprice;
    }

    public BigDecimal getAvgbuyprice() {
        return avgbuyprice;
    }

    public void setAvgbuyprice(BigDecimal avgbuyprice) {
        this.avgbuyprice = avgbuyprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public BigDecimal getTotalbuyprice() {
        return totalbuyprice;
    }

    public void setTotalbuyprice(BigDecimal totalbuyprice) {
        this.totalbuyprice = totalbuyprice;
    }

    public BigDecimal getTotalsaleprice() {
        return totalsaleprice;
    }

    public void setTotalsaleprice(BigDecimal totalsaleprice) {
        this.totalsaleprice = totalsaleprice;
    }

    public Date getUpdatime() {
        return updatime;
    }

    public void setUpdatime(Date updatime) {
        this.updatime = updatime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}