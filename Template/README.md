# Template Pattern

### 장점
* 코드의 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸기 용이.
* 다른 관점에서 보면 동일한 기능을 상위 클래스에서 정의하고, 확장/변화가 필요한 부분만 서브클래스에서 구현할 수 있다.
* 재활용성 증가

### 사용 패턴
1. 알고리즘을 여러 단계로 나눈다.
2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
3. 알고리즘을 수행할 템플릿 메소드를 만든다.
4. 하위 클래스에서 나눠진 메소드들을 구현한다.

#### 이럴 때 사용하자
* 구현하려는 알고리즘이 일정한 프로세스가 있음.
* 구현하려는 알고리즘의 변경 가능성이 있음.
### 요구사항
> 일반 게임 사용자와 관리자는 다음과 같은 공통 연결 프로세스를 가지며, 키 복호화 방식(doSecurity)만 다르게 가진다. 

* 일반 사용자

| 공통 프로세스   |
| -------------|
| 사용자 인증 (authentication)     |
| 권한 확인 (authorization)     |
| 연결 (connection)  |


### Structure
![structure](https://gmlwjd9405.github.io/images/design-pattern-template-method/template-method-pattern.png)

### Class Diagram
![diagram](https://github.com/ShinMyeongJi/Images/blob/master/designpattern/template.PNG?raw=true)
