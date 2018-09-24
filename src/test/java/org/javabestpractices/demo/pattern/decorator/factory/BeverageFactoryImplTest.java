package org.javabestpractices.demo.pattern.decorator.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BeverageFactoryImplTest
{
    @InjectMocks
    BeverageFactoryImpl beverageFactory;

    @Test
    public void createBeverage(){
        String beverage = beverageFactory.createBeverage();
        assertThat(beverage, equalTo("Your order: Espresso with caramel with milk, and total price as 3.2"));
    }
}