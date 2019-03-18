package headfirst.singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    // volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가
    // Singleton 인스턴스로 초기화되는 과정이 올바르게 진행되도록 할 수 있다 (?)

    private Singleton() {

    }

    // Double-Checking Locking
    public static Singleton getInstance() {
        if (uniqueInstance == null) { // read from main memory
            synchronized (Singleton.class) {
                if (uniqueInstance == null) { // read from main memory
                    uniqueInstance = new Singleton(); // write to main memory
                }
            }
        }
        return uniqueInstance;
    }
}
