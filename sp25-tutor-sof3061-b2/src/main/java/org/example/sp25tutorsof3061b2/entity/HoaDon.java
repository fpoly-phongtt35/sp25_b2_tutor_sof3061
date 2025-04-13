package org.example.sp25tutorsof3061b2.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "[order]")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private Long maHoaDon;

    @Column(name = "createddate")
    private Date ngayLapHoaDon;

    @Column(name = "customernumber")
    private String sdtKhachHang;

    public Long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }
}
