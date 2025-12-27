package com.xanthos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xanthos.model.domain.BillCategory;
import com.xanthos.service.BillCategoryService;
import com.xanthos.mapper.BillCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Crane Resigned
* @description 针对表【bill_category(账单分类表)】的数据库操作Service实现
* @createDate 2025-12-27 14:32:43
*/
@Service
public class BillCategoryServiceImpl extends ServiceImpl<BillCategoryMapper, BillCategory>
    implements BillCategoryService{

}




