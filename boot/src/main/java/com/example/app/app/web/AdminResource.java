package com.example.app.app.web;

import com.example.app.app.config.security.RoleType;
import com.example.app.app.utils.SecurityUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminResource {

    @GetMapping("")
    public String getByAdmin() {
        boolean isAdmin = SecurityUtil.isAuthenticationTypeAble(RoleType.ADMIN);
        log.info("ADMIN_PAGE|isAdmin={}", isAdmin);
        return "SUCCESS";
    }

}
