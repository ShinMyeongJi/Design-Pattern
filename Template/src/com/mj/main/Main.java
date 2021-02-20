package com.mj.main;

import com.mj.function.AbstGameConnection;
import com.mj.function.DefaultUserSecurity;
import com.mj.function.ManagerSecurity;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class Main {
    public static void main(String[] args) {
        AbstGameConnection ac1 = new DefaultUserSecurity();
        ac1.requestConnection("default #463463", "gildong", "q1w2e3");

        System.out.println("====================================================");

        AbstGameConnection ac2 = new ManagerSecurity();
        ac2.requestConnection("game manager", "manager", "xxxxx");



    }
}
