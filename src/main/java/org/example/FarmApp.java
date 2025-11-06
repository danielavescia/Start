package org.example;

import java.util.List;

public class FarmApp{

    //injeção de dependências
    private final List<Talkable> minhaFazenda;

    public FarmApp(List<Talkable> minhaFazenda){
        this.minhaFazenda = minhaFazenda;
    }

    public void iniciarApp(){
        System.out.println("Iniciando a Fazenda");

        // programação funcional
             minhaFazenda.forEach(t ->  System.out.println(t.toString())); 

        /*for (Talkable t : minhaFazenda){
           System.out.println(t.talk());
        } */     
    }

    public static void main(String[] args) {
        try{
            List<Talkable> coisasFazenda = List.of(
                new Cat("Mimi"),
                new Dog("Bud"), 
                new Cow("Mimosa"),
                new Radio()
            );

            FarmApp f = new FarmApp(coisasFazenda);
        
            f.iniciarApp();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}