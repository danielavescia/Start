package org.example;
/**
 * Representa um vaca que é um tipo de {@link Animal}.
 * <p>A classe sobrescreve o método {@code talk()} para retornar o som característico de uma vaca</p>
 */

public class Cow extends Animal{
    
    /**
     * Cria uma nova instância de {@code Cow}.
     * 
     * @param name o nome da vaca
     */

    public Cow(String name){
        super(name);
    }

    /**
     * Retorna o som emitido pela vaca.
     * 
     * @return string com o som "muuu"
     */
    @Override
    public String talk(){
        return "muuu";
    }
}
