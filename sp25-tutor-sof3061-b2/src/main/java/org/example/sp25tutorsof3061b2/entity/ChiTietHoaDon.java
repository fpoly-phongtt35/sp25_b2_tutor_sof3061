package org.example.sp25tutorsof3061b2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "orderdetail")
public class ChiTietHoaDon {

    @EmbeddedId
    private ChiTietId chiTietId;

    @Column(name = "purchasedmoney")
    private BigDecimal donGiaMua;

    @Column(name = "purchasedquantity")
    private Integer soLuongMua;

    public ChiTietId getChiTietId() {
        return chiTietId;
    }

    public void setChiTietId(ChiTietId chiTietId) {
        this.chiTietId = chiTietId;
    }

    public BigDecimal getDonGiaMua() {
        return donGiaMua;
    }

    public void setDonGiaMua(BigDecimal donGiaMua) {
        this.donGiaMua = donGiaMua;
    }

    public Integer getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(Integer soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
}
