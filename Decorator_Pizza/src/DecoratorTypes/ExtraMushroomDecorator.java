package DecoratorTypes;

import Decorators.ToppingDecorator;
import Pizza.BasePizza;

public class ExtraMushroomDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraMushroomDecorator (BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
