package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Component;

/**
 * @author 刘家雯
 * @version 1.0
 */
@Component
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
