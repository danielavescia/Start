package org.example;

import java.util.List;

public class FarmApp{
    public static void main(String[] args) {
        List<Talkable> coisasFazenda = List.of(
            new Cat("Mimi"),
            new Dog("Bud"), 
            new Cow("Mimosa"),
            new Radio()
        );

        System.out.println("Iniciando a Fazenda");
        
        for (Talkable t : coisasFazenda){
            t.talk();
        }

    }
}