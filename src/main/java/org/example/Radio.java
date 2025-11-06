package org.example;
/**
 * <p> Representa um rádio que implementa a interface {@link Talkable}
 * implementação específica da função (@link #talk())
 * <p>
 */
public class Radio implements Talkable {
     
    /**
     * Cria uma nova instância de {@code Radio}.
     */
    public Radio(){};

   /**
     * Retorna o som emitido pelo Rádio.
     * 
     * @return string com o som "Rádio gaúcha"
     */
    @Override
    public String talk(){
        return "Rádio gaúcha";
    }

     /**
         * <p> Retorna uma representação textual do radio 
         * que por padrão é o som produzido por ele ({@link #talk()}).</p>
         *
         * @return som do radio como {@code String}
     */
    @Override
    public String toString() {
        return this.talk();
    }
}

