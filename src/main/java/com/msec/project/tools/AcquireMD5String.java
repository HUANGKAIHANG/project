package com.msec.project.tools;

import org.springframework.util.DigestUtils;

public class AcquireMD5String {
    public static String getNewMD5WithSalt(String password, String salt) {
        String passwordMD5 = DigestUtils.md5DigestAsHex(password.getBytes());
        String newPassword = passwordMD5 + salt;
        return DigestUtils.md5DigestAsHex(newPassword.getBytes());
    }
}
