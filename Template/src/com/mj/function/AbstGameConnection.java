package com.mj.function;

public abstract class AbstGameConnection {
    protected abstract void doSecurity(String str);

    protected boolean authentication(String id, String pw){

        //찐 로직을 짠다면 DB에서 비교하는 부분이 되겠다.
        String uid = "gildong";
        String upw = "q1w2e3";

        if(id.equals(uid) && pw.equals(upw)) {
            System.out.println("id : " + id + "인증 완료");
            return true;
        }else {
            System.out.println("id : " + id + "인증 실패");
            return false;
        }
    }

    protected int authorization(String userName){

        String auth = "gm";
        int defaultUser = 2;

        if(!auth.equals(userName)) {
            System.out.println("auth - 일반 유저");
            return defaultUser;
        }else {
            System.out.println("auth - 게임 매니저");
            return 1;
        }

    }

    protected String connection() {
        System.out.println("연결 중");
        return "연결 완료";
    }


    public String requestConnection(String encodedStr, String id, String pw) {
        doSecurity(encodedStr);
        authentication(id, pw);
        authorization(id);

        return connection();
    }
}
