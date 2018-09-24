package org.javabestpractices.demo.pattern.decorator.model;

import java.math.BigDecimal;

public class Espresso implements Beverage
{

    public String description()
    {
        return "Espresso";
    }


    public BigDecimal price()
    {
        return BigDecimal.valueOf(1.50);
    }
}
