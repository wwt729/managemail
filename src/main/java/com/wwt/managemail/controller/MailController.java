package com.wwt.managemail.controller;

import com.wwt.managemail.common.PageResult;
import com.wwt.managemail.dto.MailDTO;
import com.wwt.managemail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("page")
    public ResponseEntity<PageResult<MailDTO>> querySpuPage(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int rows,
            @RequestParam(value = "status",required = false)Integer status,
            @RequestParam(value = "sendCount",required = false)Integer sendCount)
    {
        return ResponseEntity.ok(mailService.queryMailList(page,rows,status,sendCount));
    }

    @PostMapping("delete")
    public ResponseEntity<Void> deleteMail(Long mailId){
        mailService.deleteMail(mailId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
