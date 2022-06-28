# Abstract Factory Pattern

### 장점
* 기존 코드를 수정할 필요가 없음
* 호환성이 없는 인터페이스 때문에 동작할 수 없는 클래스들을 함께 작동할 수 있게 함
* 재활용성 증가

### 활용
* 객체가 생성되거나 구성, 표현되는 방식과 무관하게 시스템을 독립적으로 만들고자 할 때
* 여러 제품군 중 하나를 선택해서 시스템을 설정해야 하고 한번 구성한 제품을 다른 것으로 대체할 수 있을 때
* 관련된 제품 객체들이 함께 사용되도록 설계되었고, 이 부분에 대한 제약이 외부에도 지켜지도록 하고 싶을 때
* 제품에 대한 클래스 라이브러리를 제공하고, 그들의 구현이 아닌 인터페이스를 노출시키고 싶을 때

### 요구사항
> 각 제조사가 다른 컴퓨터 생산 시스템을 만들어야 한다. 

### Structure
![structure](https://johngrib.github.io/post-img/abstract-factory-pattern/structure.gif)

* AbstractFactory : 개념적 제품에 대한 객체를 생성한 연산으로 인터페이스를 정의
* ConcreteFactory : 구체적인 제품에 대한 객체를 생성하는 연산을 구현한다. (SaumsungComputerFactory, LGComputerFactory)
* AbstractProduct : 개념적 제품 객체에 대한 인터페이스 정의
* ConcreteProduct : 구체적으로 팩토리가 생성할 객체를 정의하고, AbstractProduct 정의하는 인터페이스를 구현한다.


### Class Diagram

![image](https://user-images.githubusercontent.com/31172248/176183567-2eb0c0e3-e83e-411a-9f45-cf83af52800a.png)

To-do. 이 패턴을 적용한 Iterator, Collection 찾아보기
