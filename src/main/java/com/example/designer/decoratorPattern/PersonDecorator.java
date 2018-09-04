package com.example.designer.decoratorPattern;

public abstract class PersonDecorator implements Person {
    protected Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    public void say() {
        person.say();
    }
}
