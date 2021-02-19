# Adapter Pattern

### 장점
* 기존 코드를 수정할 필요가 없음
* 호환성이 없는 인터페이스 때문에 동작할 수 없는 클래스들을 함께 작동할 수 있게 함
* 재활용성 증가

### 요구사항
> A사가 G사로 합병 되면서 시스템 통합을 위해 G사의 식권 발매 시스템에 맞춰 A사의 식권 발매 시스템을 수정하려한다. (기존 기능은 수정하지 않는다.)

* A사의 식권 발매 시스템 기능

| A Company    |
| -------------|
| 식권 선택     |
| 식권 출력     |
| 오프라인 구매  |

* G사의 식권 발매 시스템 기능

| G Company    |
| -------------|
| 식권 선택     |
| 식권 출력     |
| 오프라인 구매  |
| 온라인 구매  |
| 음식 리스트 가져오기 |


### Structure
![structure](https://upload.wikimedia.org/wikipedia/commons/d/d7/ObjectAdapter.png)

### Class Diagram
![diagram](https://github.com/ShinMyeongJi/Images/blob/master/designpattern/Adapter%20.PNG?raw=true)
