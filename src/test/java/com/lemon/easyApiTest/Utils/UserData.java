package com.lemon.easyApiTest.Utils;

import java.util.HashMap;
import java.util.Map;


public class UserData {
    //存储接口响应变量
    public static Map<String,Object> VARS = new HashMap<>();
    public static Map<String,String> DEFAUT_HEADERS = new HashMap<>();

    static {
        DEFAUT_HEADERS.put("X-Lemonban-Media-Type","lemonban.v2");
        DEFAUT_HEADERS.put("Content-Type","application/json");
    }
}
