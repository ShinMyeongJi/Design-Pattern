package com.mj.function;

import com.mj.function.AbstGameConnection;

public class DefaultUserSecurity extends AbstGameConnection {
    @Override
    protected void doSecurity(String str) {
        System.out.println("일반유저는 " + str + "키로 2 방식 인증");
    }
}
