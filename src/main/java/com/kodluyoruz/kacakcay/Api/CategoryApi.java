package com.kodluyoruz.kacakcay.Api;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedCategoryRequestDto;
import com.kodluyoruz.kacakcay.Service.Abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryApi {

    private final CategoryService categoryService;

    @PostMapping("/add")
    public String add(@RequestBody AddedCategoryRequestDto addedCategoryRequestDto){
        return this.categoryService.add(addedCategoryRequestDto);
    }
}
