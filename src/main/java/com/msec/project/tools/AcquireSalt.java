package com.msec.project.tools;

import java.util.UUID;

public class AcquireSalt {

    public static String getNewSalt() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
