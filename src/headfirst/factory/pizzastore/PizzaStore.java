package headfirst.factory.pizzastore;

import headfirst.factory.pizza.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza; // 추상클래스인 Pizza 클래스에만 의존하게 된다 (Dependency Inversion Principle)

        pizza = createPizza(type); // 실제 생산될 product 에 대한 사전 지식이 전혀 없음

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type); // 팩토리 메소드 패턴에서는 어떤 클래스의 인스턴스를 만들지를 서브클래스에서 결정
}
