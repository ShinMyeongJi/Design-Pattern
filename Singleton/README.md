# Singleton Pattern

### 장점
* 메모리 낭비를 방지한다.
* 다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다.
* 두 번째 이용시부터 객체 로딩 시간이 현저하게 줄어 성능이 좋아진다.


#### 이럴 때 사용하자
* DBCP처럼 공통된 객체를 여러개 생성해서 사용할 때
* 인스턴스가 절대적으로 한개만 존재하는 것을 보증하고 싶을 경우

### 요구사항
> 전 직원이 사용하는 프린터기의 현재 상태를 출력하라

### 다중 스레드에서 Singleton 패턴을 이용할 시 인스턴스가 1개 이상 생성되는 경우
(출처 : https://gmlwjd9405.github.io/2018/07/06/singleton-pattern.html)
* 경합 조건 발생 경우
    + Printer 인스턴스가 아직 생성되지 않았을 경우 Thread1이 getPrinter 메서드의 if문을 실행해 이미 인스턴스가 생성되었는지 확인한다. 현재 printer 변수는 null이다.
    + Thread1이 생성자를 호출해 인스턴스를 만들기 전 Thread2가 if문을 실행해 printer 변수가 null인지 확인한다. 현재 null이기 때문에 또 생성자를 호출하여 인스턴스를 생성한다.
    + 이후 Thread1은 첫 번째에서 인스턴스가 null인지 확인헀으므로 마찬가지로 인스턴스를 생성하는 코드를 실행하면 인스턴스는 2개가 된다.
* 경합 조건이란?
    +메모리와 같은 동일한 자원을 2개 이상의 스레드가 이용하려고 경합하는 현상
    
#### 해결방법
* 정적 변수에 인스턴스를 만들어 바로 초기화 하는 방법
<pre> 
    private static Printer printer = new Printer();
    public Printer getInstance() {
        return printer;
    }
</pre>   

* 인스턴스를 만드는 메서드 및 공유 변수 접근 함수에 동기화하는 방법
    + 다만 getInstance에 Lock을 하는 방식이라 속도가 느리다.
<pre> 
    private static Printer printer = new Printer();
    //인스턴스 생성 메서드 동기화(임계 구역 설정)
    public synchronized static Printer getInstance() {
        return printer;
    }
    
    public void print(String str) {
        //하나의 스레드의 접근만 허용 (임계구역)
        synchronized(this) {
            ..
        }
    }
</pre>  
    
### Structure
![structure](https://gmlwjd9405.github.io/images/design-pattern-singleton/singleton-example.png)
