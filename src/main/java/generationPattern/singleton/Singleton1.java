package generationPattern.singleton;

// 기본
public class Singleton1 {
    // 객체의 인스턴스를 static 으로 선언.
    private static Singleton1 instance;

    // private 생성자로 외부에서 객체 생성을 막는다.
    private Singleton1() {
    }

    // 외부에서 접근이 가능한 getInstance() 생성 및 instance 반환.
    public static Singleton1 getInstance() {
        // instance 가 null 인 경우에만 생성.
        if(instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }
}
