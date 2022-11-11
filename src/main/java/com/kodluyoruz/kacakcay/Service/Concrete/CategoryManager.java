package com.kodluyoruz.kacakcay.Service.Concrete;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedCategoryRequestDto;
import com.kodluyoruz.kacakcay.Dto.RequestDto.DeletedCategoryDto;
import com.kodluyoruz.kacakcay.Models.Category;
import com.kodluyoruz.kacakcay.Repository.CategoryDao;
import com.kodluyoruz.kacakcay.Service.Abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryManager  implements CategoryService {

    private final CategoryDao categoryDao;

    private final ModelMapper modelMapper;

    @Override
    public String add(AddedCategoryRequestDto addedCategoryRequestDto) {

        Category category=this.modelMapper.map(addedCategoryRequestDto,Category.class);
        this.categoryDao.save(category);
        return "Kategori eklendi.";
    }

    @Override
    public String delete(DeletedCategoryDto deletedCategoryDto) {

        Category category=this.categoryDao.findByCategoryId(deletedCategoryDto.getId());

        if (category==null){
            return "Aradığınız Kategori bulunamadı";
        }

        this.categoryDao.delete(category);

        return "Kategori Silindi.";
    }

    @Override
    public List<Category> getAll() {
        return this.categoryDao.findAll();
    }


}
