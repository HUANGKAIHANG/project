package com.msec.project.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcquireSaltTests {

    @Test
    public void generateTenSalt() {
        for (int i = 0; i < 10; i++)
            System.out.println(AcquireSalt.getNewSalt());
    }
}
