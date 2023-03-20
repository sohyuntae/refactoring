package singleton;

// Singleton test
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("SingletonMain Test");
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1);
    }
}
