package singleton;

// Double Check를 사용하여 Thread-Safe 를 보장하는 싱글톤 패턴
public class Singleton3 {
    // 객체의 인스턴스를 static 으로 선언.
    private static volatile Singleton3 instance;

    // private 생성자로 외부에서 객체 생성을 막는다.
    private Singleton3() {
    }

    /* Double Check 의 아이디어는, getInstace() 함수 전체에 Synchronzied 를 적용하는 것을 개선하기 위해 Synchronzied 를 사용하지 않고 instance 가 null 인지를 확인한 후,
    *  null 이라면 이때서야 Synchronzied 를 적용하여 스레드 동기화를 한 후 instance 가 null 인지 다시한번 체크하는 방법 이다.
    * */
    public static Singleton3 getInstance() {
        // instance 가 null 인 경우에만 생성.
        if(instance == null) {
            // synchronized 를 적용한 후, 한번 더 instance 가 null 인지를 체크
            synchronized (Singleton3.class) {
                if(instance == null) {
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }
}
