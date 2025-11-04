package org.example;

public abstract class Animal implements Talkable {
    
    protected String name;

    /**
     * @param name
     */
    public Animal(String name){

        if(name == null){
            throw new IllegalArgumentException("O nome do animal não pode ser nulo");
        }
        if(name.isBlank()){
             throw new IllegalArgumentException("O nome do animal não pode ser em branco");
        }

        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.talk();
    }
    
}
