import DecoratorTypes.ExtraCheeseDecorator;
import DecoratorTypes.ExtraMushroomDecorator;
import Pizza.BasePizza;
import PizzaTypes.Farmhouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BasePizza farmhosuePizza = new Farmhouse();
        System.out.println("farmhosuePizza cost is: " + farmhosuePizza.cost());

        BasePizza farmhosuePizzaWithExtraCheese = new ExtraCheeseDecorator(new Farmhouse());
        System.out.println("farmhosuePizzaWithExtraCheese cost is: " + farmhosuePizzaWithExtraCheese.cost());

        BasePizza farmhosuePizzaWithExtraCheeseandExtraMushroom = new ExtraMushroomDecorator(new ExtraCheeseDecorator(new Farmhouse()));
        System.out.println("farmhosuePizzaWithExtraCheeseandExtraMushroom cost is: " + farmhosuePizzaWithExtraCheeseandExtraMushroom.cost());
    }
}