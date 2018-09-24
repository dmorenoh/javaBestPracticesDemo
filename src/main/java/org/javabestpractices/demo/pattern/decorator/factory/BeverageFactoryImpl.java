package org.javabestpractices.demo.pattern.decorator.factory;

import org.javabestpractices.demo.pattern.decorator.model.Beverage;
import org.javabestpractices.demo.pattern.decorator.model.BeverageDecorator;
import org.javabestpractices.demo.pattern.decorator.model.Espresso;

public class BeverageFactoryImpl implements BeverageFactory
{
    @Override
    public String createBeverage()
    {
        return BeverageDecorator.createBeverage(new Espresso(), Beverage::withCaramel, Beverage::withMilk);
    }
}
