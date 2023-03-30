package generationPattern.singleton;

// LazyHolder 를 사용하는 싱글톤 패턴
public class Singleton4 {
    private Singleton4() {
    }

    // private static inner class 인 LazyHolder
    private static class LazyHolder {
        // LazyHolder 클래스 초기화 과정에서 JVM 이 Thread-Safe 하게 instance 를 생성
        private static final Singleton4 instance = new Singleton4();
    }

    /* Java 진영에서 가장 많이 사용되는 LazyHolder 를 사용하는 싱글톤 패턴
    * private static class 인 LazyHolder 안에 instace 를 final 로 선언하는 방법
    * JVM (Java Virtual Machine) 의 클래스의 초기화 과정에서 원자성을 보장하는 원리를 이용하는 방식 이다.
    * LazyHolder 는 JVM 자체의 특성을 최대한 이끌어내어 성능저하를 막는 나름대로 우아한 방식이라고 할 수 있다.
    * */
    public static Singleton4 getInstance() {
        return LazyHolder.instance;
    }
}
