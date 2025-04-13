package org.example.sp25tutorsof3061b2.controller;

import org.example.sp25tutorsof3061b2.entity.HoaDon;
import org.example.sp25tutorsof3061b2.repository.HoaDonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hoa-don")
public class HoaDonController {

    private final HoaDonRepository repository;
    private final int PAGE_SIZE = 10;

    public HoaDonController(HoaDonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<HoaDon> getAll() {
        return repository.findAll();
    }

    // Vi du: Locahost:8080/hoa-don/pagination?page=0
    @GetMapping("/pagination")
    public List<HoaDon> getByPage(@RequestParam(name = "page", defaultValue = "0") int trang) {
        Pageable pageable = Pageable.ofSize(PAGE_SIZE).withPage(trang);
        Page<HoaDon> page = repository.findAll(pageable);
        return page.getContent();
    }
}
