package com.shin.creator;

import com.shin.product.Item;

public abstract class ItemCreator {
    public Item create() {
        // 아이템 생성 전 데이터 베이스에 아이템 정보 요청
        requestItemsInfo();

        Item item = createItem();

        // 아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 로그 남기기
        createItemLog();
        return item;
    }
    abstract protected void requestItemsInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();

}
