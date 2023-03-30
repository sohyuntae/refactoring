package generationPattern.singleton;

// Synchronized 를 사용하여 Thread-Safe 를 보장하는 싱글톤 패턴
public class Singleton2 {
    // 객체의 인스턴스를 static 으로 선언.
    private static Singleton2 instance;

    // private 생성자로 외부에서 객체 생성을 막는다.
    private Singleton2() {
    }

    /* synchronzied 스레드 동기화를 사용하며 멀티 스레드 환경에서의 동시성 문제 해결
    *  Synchronzied 의 가장 큰 단점은, Thread-Safe 를 보장하기 위해 속도를 포기했다는 점 이다.
    *  Synchronzied 를 적용하면 보통 적용하지 않았을 때 보다 약 100배 정도 속도가 느려지는 단점이 있다고 알려져 있다고 한다.
    * */
    public static synchronized Singleton2 getInstance() {
        // instance 가 null 인 경우에만 생성.
        if(instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}
