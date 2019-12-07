package com.zjut.smartClassroom.Service.impl;

import com.zjut.smartClassroom.Service.PaperService;
import com.zjut.smartClassroom.dataObject.Paper;
import com.zjut.smartClassroom.error.BusinessException;
import com.zjut.smartClassroom.error.EnumBusinessError;
import com.zjut.smartClassroom.repository.CourseRepository;
import com.zjut.smartClassroom.repository.PaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: smartClassroom
 * @Package: com.zjut.smartClassroom.Service.impl
 * @ClassName: PaperServiceImpl
 * @Author: FrankWu
 * @Description: ${description}
 * @Date: 2019/12/7 13:12
 * @Version: 1.0
 */

public class PaperServiceImpl implements PaperService {
    // 引入
    @Autowired(required = false)
    private PaperRepository paperRepository;


    @Override
    @Transactional
    public Paper findPaperById(Integer paperId) throws BusinessException {
        Paper paperResult = paperRepository.findByPaperId(paperId);
        if(paperResult == null){
            throw new BusinessException(EnumBusinessError.RECORD_NOT_EXIST);
        }
        return paperResult;
    }
}
