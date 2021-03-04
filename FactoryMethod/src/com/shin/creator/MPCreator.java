package com.shin.creator;

import com.shin.product.Item;
import com.shin.product.MP;

public class MPCreator extends ItemCreator{
    @Override
    protected void requestItemsInfo() {
        System.out.println("mp 물약 정보를 db에서 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("mp 물약 생성 정보를 로그로 기록합니다.");
    }

    @Override
    protected Item createItem() {
        return new MP();
    }
}
