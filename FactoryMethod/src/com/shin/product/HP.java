package com.shin.product;

public class HP implements Item{
    @Override
    public void use() {
        System.out.println("hp 포션 사용");
    }
}
