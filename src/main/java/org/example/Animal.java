package org.example;

import java.util.Objects;

/** 
 * Classe abstrata que representa um animal genérico.
 * Todo animal deve ter um nome e a capacidade de falar/talk definida pela interface {@link Talkable}.
 * As subclasses devem implementar o método {@code talk()}.
 * <p>
 * **/


public abstract class Animal implements Talkable {
    
    protected String name;

    /**
     * @param name nome do animaol que não pode ser nulo nem em branco. 
     * O nome é validado pelo método {@code validateName}.
     * <p>
     **/
    public Animal(String name){
        this.name = validateName(name);      
    }

    /** 
     * Retorna p nome do animal
     * @return o nome do animal
     * <p>
     **/
    public String getName() {
        return name;
    }

    /** 
     * Redefine o nome do animal
     * @param name novo do animal que não pode ser nulo nem em branco.
     * <p>
     **/
    public void setName(String name){
        this.name = validateName(name);
    }

    /**
     * Retorna uma representação textual do animal,
     * que por padrão é o som produzido por ele ({@link #talk()}).
     *<p>
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
