package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserManage {

    @Transactional
    public String getUser() throws Exception {
        return "test";
    }
}
