package org.example;

import java.util.Objects;

/** 
 * Classe abstrata que representa um animal genérico.
 * <p>
 * Todo animal deve ter um nome e a capacidade de falar/talk definida pela interface {@link Talkable}.
 * As subclasses devem implementar o método {@code talk()}.
 * </p>
 */


public abstract class Animal implements Talkable {
    
    protected String name;

    /**
     * @param name nome do animal que não pode ser nulo nem em branco. 
     *  <p>O nome é validado pelo método {@code validateName}.</p>
     *
     */
    public Animal(String name){
        this.name = validateName(name);    
        
        /*Para o programa antes da produção
        assert name != null;
        assert !name.isBlank();
        p/ funcioanr o assert: java -ea -cp target/classes/or.example.FarmApp
        */  
    }

    /** 
     * Retorna a string que corresponde ao nome do animal 
     * @return o nome do animal
     */
    public String getName() {
        return name;
    }

    /** 
     *  Redefine o nome do animal  
     * @param name novo do animal que não pode ser nulo nem em branco.
     *
     **/
    public void setName(String name){
        this.name = validateName(name);
    }

    /**
     * Retorna uma representação textual do animal 
     * que por padrão é o som produzido por ele ({@link #talk()}).
     *
     * @return som do animal como {@code String}
     */
    @Override
    public String toString(){
        return this.talk();
    }

    /**
     * Valida o nome de um animal.
     * <p>
     * O nome não pode ser {@code null} nem estar em branco. 
     * Caso a validação falhe, uma exceção será lançada.
     * </p>
     *
     * @param name o nome a ser validado
     * @return o próprio nome, caso seja válido
     * @throws NullPointerException se o nome for {@code null}
     * @throws IllegalArgumentException se o nome estiver em branco
     */
    protected static String validateName(String name) {

        name = Objects.requireNonNull(name, "O nome do animal não pode ser nulo");
    
        if(name.isBlank()){
             throw new IllegalArgumentException("O nome do animal não pode ser em branco");
        }

        return name;
    }
    
}
