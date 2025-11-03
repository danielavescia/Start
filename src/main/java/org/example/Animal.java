package org.example;

public abstract class Animal implements Talkable {
    
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    //Não é obrigatório colocar.
    /* 
    @Override
    public abstract String talk();
    */
}
