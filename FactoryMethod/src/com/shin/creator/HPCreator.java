package com.shin.creator;

import com.shin.product.HP;
import com.shin.product.Item;

public class HPCreator extends ItemCreator{
    @Override
    protected void requestItemsInfo() {
        System.out.println("hp 물약 정보를 db에서 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("hp 물약 생성 정보를 로그로 기록합니다.");
    }

    @Override
    protected Item createItem() {
        return new HP();
    }
}
