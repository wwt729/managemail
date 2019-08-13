package com.wwt.managemail.mapper;

import com.wwt.managemail.dto.MailDTO;
import com.wwt.managemail.entity.Mail;
import com.wwt.managemail.utils.CommonMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MailMapper extends CommonMapper<Mail> {
    List<MailDTO> selectMailList(@Param("status") Integer status, @Param("sendCount") Integer sendCount);
}
