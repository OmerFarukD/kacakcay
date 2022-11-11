package com.kodluyoruz.kacakcay.Api;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedCategoryRequestDto;
import com.kodluyoruz.kacakcay.Dto.RequestDto.DeletedCategoryDto;
import com.kodluyoruz.kacakcay.Models.Category;
import com.kodluyoruz.kacakcay.Service.Abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryApi {

    private final CategoryService categoryService;

    @PostMapping("/add")
    public String add(@Valid @RequestBody AddedCategoryRequestDto addedCategoryRequestDto){
        return this.categoryService.add(addedCategoryRequestDto);
    }

    @PostMapping("/delete")
    public String delete(@RequestBody DeletedCategoryDto deletedCategoryDto){
        return this.categoryService.delete(deletedCategoryDto);
    }
    @GetMapping("/getall")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }
}
