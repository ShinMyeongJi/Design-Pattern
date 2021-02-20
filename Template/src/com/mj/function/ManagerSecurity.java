package com.mj.function;

import com.mj.function.AbstGameConnection;

public class ManagerSecurity extends AbstGameConnection {
    @Override
    protected void doSecurity(String str) {
        System.out.println("매니저는 " + str + "키로 2 방식 인증");

    }
}
