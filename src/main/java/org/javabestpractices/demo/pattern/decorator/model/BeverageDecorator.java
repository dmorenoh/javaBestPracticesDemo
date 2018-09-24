package org.javabestpractices.demo.pattern.decorator.model;

import java.util.function.Function;
import java.util.stream.Stream;

public class BeverageDecorator
{

    private final Function<Beverage, Beverage> condiments;


    @SafeVarargs
    private BeverageDecorator(Function<Beverage, Beverage>... condiments)
    {
        this.condiments = Stream.of(condiments).reduce(Function.identity(), Function::andThen);
    }


    @SafeVarargs
    public static String createBeverage(Beverage beverage, Function<Beverage, Beverage>... condiments)
    {
        BeverageDecorator beverageDecorator = new BeverageDecorator(condiments);
        Beverage beverageTuned = beverageDecorator.condiments.apply(beverage);
        return String.format("Your order: %s, and total price as %s", beverageTuned.description(), beverageTuned.price());
    }


}
