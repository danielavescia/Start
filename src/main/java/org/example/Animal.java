package org.example;

import java.util.Objects;

public abstract class Animal implements Talkable {
    
    protected String name;

    /**
     * @param name
     */
    public Animal(String name){
        this.name = validateName(name);      
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = validateName(name);
    }

    @Override
    public String toString(){
        return this.talk();
    }

    protected static  String validateName(String name){
        name = Objects.requireNonNull(name, "O nome do animal não pode ser nulo");
    
        if(name.isBlank()){
             throw new IllegalArgumentException("O nome do animal não pode ser em branco");
        }

        return name;
    }
    
}
