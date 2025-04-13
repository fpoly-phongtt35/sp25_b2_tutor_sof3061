package org.example.sp25tutorsof3061b2.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Product") // rep 1:1 voi CSDL
public class SanPham {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "productid")
    private Long maSanPham;

    @Column(name = "productname")
    private String tenSanPham;

    @Column(name = "price")
    private BigDecimal giaHienHanh;

    public Long getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Long maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public BigDecimal getGiaHienHanh() {
        return giaHienHanh;
    }

    public void setGiaHienHanh(BigDecimal giaHienHanh) {
        this.giaHienHanh = giaHienHanh;
    }
}
