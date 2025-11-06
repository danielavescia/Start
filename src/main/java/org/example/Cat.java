package org.example;

/**
 * Representa um gato que é um tipo de {@link Animal}.
 * <p>A classe sobrescreve o método {@code talk()} para retornar o som característico de um gato</p>
 */
public class Cat extends Animal{

    /**
     * Cria uma nova instância de {@code Cat}.
     * 
     * @param name o nome do gato
     */
    public Cat(String name){
        super(name);
    }
    
    /**
     * Retorna o som emitido pelo gato.
     * 
     * @return string com o som "miau"
     */
    @Override
    public String talk(){
        return "miau";
    }

}
