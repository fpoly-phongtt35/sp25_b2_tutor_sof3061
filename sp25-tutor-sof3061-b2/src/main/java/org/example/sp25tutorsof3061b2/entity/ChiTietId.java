package org.example.sp25tutorsof3061b2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ChiTietId implements Serializable {

    @Column(name = "orderid")
    private Long maHoaDon;

    @Column(name = "productid")
    private Long maSanPham;

    public Long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Long getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Long maSanPham) {
        this.maSanPham = maSanPham;
    }
}
