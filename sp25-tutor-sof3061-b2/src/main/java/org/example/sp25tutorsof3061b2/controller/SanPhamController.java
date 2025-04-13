package org.example.sp25tutorsof3061b2.controller;

import org.example.sp25tutorsof3061b2.entity.SanPham;
import org.example.sp25tutorsof3061b2.repository.SanPhamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/san-pham")
public class SanPhamController {

    private final SanPhamRepository repository;

    public SanPhamController(SanPhamRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<SanPham> getAll() {
        return repository.findAll();
    }

}
