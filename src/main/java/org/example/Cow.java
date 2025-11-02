package org.example;

public class Cow extends Animal{
    
    public Cow(String name){
        super(name);
    }

    @Override
    public String talk(){
        return "muuu";
    }
}
