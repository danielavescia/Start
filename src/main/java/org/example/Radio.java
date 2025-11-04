package org.example;

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

