package com.example.designer.decoratorPattern;

public class MixedPersonDecorator extends PersonDecorator {

    public MixedPersonDecorator(Person person) {
        super(person);
    }

    @Override
    public void say() {
        person.say();
        learnFrenchLang(person);
    }

    private void learnFrenchLang(Person person) {
        System.out.println("say french");
    }
}
