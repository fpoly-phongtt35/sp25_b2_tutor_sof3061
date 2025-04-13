package org.example.sp25tutorsof3061b2.controller;

import org.example.sp25tutorsof3061b2.dto.ChiTietProj;
import org.example.sp25tutorsof3061b2.entity.ChiTietHoaDon;
import org.example.sp25tutorsof3061b2.repository.ChiTietHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chi-tiet")
public class ChiTietController {

    @Autowired
    private ChiTietHoaDonRepository repository;

    @GetMapping
    public List<ChiTietProj> getAll() {
        return repository.myFind();
    }

}
