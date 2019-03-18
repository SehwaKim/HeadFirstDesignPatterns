package headfirst.singleton;

public class Client {
    public static void main(String[] args) {

        new Thread(()->{
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
            System.out.println("1");
        }).run();

        new Thread(()->{
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
            System.out.println("2");
        }).run();

        new Thread(()->{
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
            System.out.println("3");
        }).run();
    }
}
