package org.example;
/**
 * Representa um cachorro  que é um tipo de {@link Animal}.
 * <p>A classe sobrescreve o método {@code talk()} para retornar o som característico de um cachorro</p>
 */

public class Dog extends Animal{

     /**
     * Cria uma nova instância de {@code Cachorro}.
     * 
     * @param name o nome do cachorro
     */

    public Dog(String name){
        super(name);
    }

    /**
     * Retorna o som emitido pelo cachorro.
     * 
     * @return string com o som "au-au"
     */

    @Override
    public String talk(){
        return"au-au";
    }
}
