package com.msec.project.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcquireMD5StringTests {

    @Test
    public void generateMD5WithSalt(){
        String password = "123456";
        String salt = "AAA";
        System.out.println(
                AcquireMD5String.getNewMD5WithSalt(password,salt));
    }
}
