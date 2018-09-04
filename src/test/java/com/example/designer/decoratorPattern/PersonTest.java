package com.example.designer.decoratorPattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Test
    public void say() {
        Person chinesePerson = new ChinesePerson();

        Person chineseAndFrench = new MixedPersonDecorator(new ChinesePerson());
        Person americaAndFrench = new MixedPersonDecorator(new AmericaPerson());
        System.out.println("chinese:");
        chinesePerson.say();

        System.out.println("\nchinese And french ");
        chineseAndFrench.say();

        System.out.println("\namerica  And french  ");
        americaAndFrench.say();
    }
}