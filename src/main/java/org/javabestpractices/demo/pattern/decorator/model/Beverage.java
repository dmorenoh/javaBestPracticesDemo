package org.javabestpractices.demo.pattern.decorator.model;

import java.math.BigDecimal;

public interface Beverage
{
    String description();

    BigDecimal price();

    static Beverage withMilk(final Beverage beverage)
    {
        return new Beverage()
        {
            @Override
            public String description()
            {
                return String.format("%s with milk", beverage.description());
            }


            @Override
            public BigDecimal price()
            {
                return beverage.price().add(BigDecimal.valueOf(1.20));
            }
        };
    }

    static Beverage withCaramel(final Beverage beverage)
    {
        return new Beverage()
        {
            @Override
            public String description()
            {
                return String.format("%s with caramel", beverage.description());
            }


            @Override
            public BigDecimal price()
            {
                return beverage.price().add(BigDecimal.valueOf(0.50));
            }
        };
    }
}
