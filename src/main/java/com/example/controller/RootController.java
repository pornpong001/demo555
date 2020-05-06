package com.example.controller;


import com.example.services.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
class RootController {

    @Autowired
    private UserManage userManage;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public void health(final HttpServletResponse r) {
        try {
            userManage.getUser();
            r.setStatus(HttpStatus.NO_CONTENT.value());
        } catch (final Exception e) {
            //log.error(e.getMessage(), e);
            r.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
    }

    @RequestMapping(value = "/ms-batch/hello", method = RequestMethod.GET)
    public String hello(final HttpServletResponse r) {
        return "OK v1.0.0";
    }


}
