package org.example.sp25tutorsof3061b2.repository;

import org.example.sp25tutorsof3061b2.dto.ChiTietProj;
import org.example.sp25tutorsof3061b2.entity.ChiTietHoaDon;
import org.example.sp25tutorsof3061b2.entity.ChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon, ChiTietId> {

    @Query("""
        SELECT cthd.chiTietId.maHoaDon AS maHoaDon,
               sp.tenSanPham AS tenSanPham,
               cthd.donGiaMua AS donGiaMua,
               cthd.soLuongMua AS soLuongMua,
               cthd.donGiaMua * cthd.soLuongMua AS thanhTien
        FROM ChiTietHoaDon cthd JOIN SanPham sp ON cthd.chiTietId.maSanPham = sp.maSanPham
        """)
    List<ChiTietProj> myFind();
}
