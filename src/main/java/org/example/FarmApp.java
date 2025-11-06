package org.example;

import java.util.List;

/**
 * Classe principal da aplicação da fazenda.
 * <p>
 * A {@code FarmApp} gerencia uma lista de elementos que "falam"
 * (implementam a interface {@link Talkable}) e executa a lógica principal
 * da aplicação, exibindo suas interações no console.
 * </p>
 *
 * <p>
 * O design utiliza injeção de dependências via construtor e programação
 * funcional para percorrer a lista de objetos.
 * </p>
 */

public class FarmApp{

     /**
     * Lista de entidades da fazenda que implementam a interface {@link Talkable}.
     */
    private final List<Talkable> minhaFazenda;

    /**
     * Cria uma nova instância da aplicação da fazenda.
     *
     * @param minhaFazenda a lista de elementos que implementam {@link Talkable}
     */

    public FarmApp(List<Talkable> minhaFazenda){
        this.minhaFazenda = minhaFazenda;
    }

    /**
     * Inicia a aplicação da fazenda.
     * <p>
     * Este método imprime uma mensagem inicial e exibe no console as representações
     * em texto de cada elemento da fazenda.
     * </p>
     */

    public void iniciarApp(){
        System.out.println("Iniciando a Fazenda");

        // programação funcional
             minhaFazenda.forEach(t ->  System.out.println(t.toString())); 

        /*for (Talkable t : minhaFazenda){
           System.out.println(t.talk());
        } */     
    }

     /**
     * Método principal que inicia a execução da aplicação.
     * <p>
     * Cria instâncias de {@link Cat}, {@link Dog}, {@link Cow} e {@link Radio},
     * e adiciona à fazenda e executa o método {@link #iniciarApp()}.
     * </p>
     */
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