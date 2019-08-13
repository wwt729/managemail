package com.wwt.managemail.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwt.managemail.common.PageResult;
import com.wwt.managemail.dto.MailDTO;
import com.wwt.managemail.mapper.MailInfoMapper;
import com.wwt.managemail.mapper.MailMapper;
import com.wwt.managemail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service("mailService")
public class MailServiceImpl implements MailService {

    @Autowired
    private MailMapper mailMapper;
    @Autowired
    private MailInfoMapper mailInfoMapper;

    @Override
    public PageResult<MailDTO> queryMailList(int page, int rows, Integer status, Integer sendCount) {
        //分页
        PageHelper.startPage(page,rows);
        //查询结果
        List<MailDTO> list = mailMapper.selectMailList(status,sendCount);

        if(CollectionUtils.isEmpty(list)){
//            throw new YbException(ExceptionEnum.SQL_RESULT_ERROR);
            return null;
        }
        //分页结果
        PageInfo<MailDTO> pageInfo=new PageInfo<>(list);

        PageResult<MailDTO> pageResult=new PageResult<>(pageInfo.getTotal(),pageInfo.getPages(),list);

        return pageResult;
    }

    @Override
    @Transactional
    public void deleteMail(Long mailId) {
        try {
            mailMapper.deleteByPrimaryKey(mailId);
            mailInfoMapper.deleteByPrimaryKey(mailId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
