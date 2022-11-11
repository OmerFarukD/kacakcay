package com.kodluyoruz.kacakcay.Service.Abstracts;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedCategoryRequestDto;
import com.kodluyoruz.kacakcay.Dto.RequestDto.DeletedCategoryDto;
import com.kodluyoruz.kacakcay.Models.Category;

import java.util.List;

public interface CategoryService {
    String add(AddedCategoryRequestDto addedCategoryRequestDto);
    String delete(DeletedCategoryDto deletedCategoryDto);
    List<Category> getAll();
}
