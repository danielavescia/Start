package org.example;

public abstract class Animal implements Talkable {
    
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public abstract String talk();
}
