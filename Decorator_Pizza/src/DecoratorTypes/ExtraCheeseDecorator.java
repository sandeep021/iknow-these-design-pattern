package DecoratorTypes;

import Decorators.ToppingDecorator;
import Pizza.BasePizza;

//ExtraCheeseDecorator is a ToppingDecorator and has a BasePizza
public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheeseDecorator (BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
