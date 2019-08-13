package com.wwt.managemail.service;

import com.wwt.managemail.dto.MailDTO;
import com.wwt.managemail.common.PageResult;

public interface MailService {
    PageResult<MailDTO> queryMailList(int page, int rows, Integer status, Integer sendCount);

    void deleteMail(Long mailId);
}
