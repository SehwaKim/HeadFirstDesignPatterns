package headfirst.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        System.out.println("create instance");
        empty = true;
        boiled = false;
    }

    public synchronized static ChocolateBoiler getInstance() { // 불필요한 오버헤드 증가 -> DCL
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("fill");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("drain");
            empty = true;
        }
    }

    public void boil() {
        if (!isBoiled() && !isEmpty()) {
            System.out.println("boil");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
