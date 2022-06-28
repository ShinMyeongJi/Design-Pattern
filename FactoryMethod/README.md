# Factory Method Pattern

### 장점
* 객체 간 결합도가 낮다.
* 객체들을 한 곳에서 관리할 수 있다.
* 객체의 생명주기를 관리하기 쉽다.

#### 이럴 때 사용하자
* 동일한 객체의 호출이 잦고 객체를 생성하는 비용이 클 경우
* 리턴 값으로 상황에 따라 서로 다른 객체를 반환할 수 있을 때(Robot 예제 참고)

### 요구사항
> 게임 아이템과 아이템 생성을 구현하라 

1. 아이템을 생성하기 전에 데이터 베이스에서 아이템을 요청한다. (requestItemsInfo)
2. 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성 로그를 남긴다. (createItemLog)
3. 아이템 생성 주체를 ItemCreator로 짓는다.(Factory)
4. 아이템은 Item 이라는 인터페이스로 다루며 item은 use 함수를 기본함수로 갖고 있다.
5. 아이템에는 체력 회복 물약, 마력 회복 물약이 있다.


### Structure
![structure](http://www.dofactory.com/images/diagrams/net/factory.gif)

### Class Diagram
![image](https://user-images.githubusercontent.com/31172248/176183802-976f2c3c-d6c3-4f99-9142-46a0ae8e0320.png)
