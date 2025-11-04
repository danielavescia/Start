package org.example;
/**
 * Representa um rádio que implementa a interface {@link Talkable}
 * implementação específica da função (@link #talk())
 * <p>
 */
public class Radio implements Talkable {
    
    public Radio(){};

    @Override
    public String talk(){
        return "Rádio gaúcha";
    }

    @Override
    public String toString() {
        return this.talk();
    }
}

