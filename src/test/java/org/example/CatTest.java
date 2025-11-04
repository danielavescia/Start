package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    void testTalkCat(){

        //Given - já testa criação de objeto
        Cat c = new Cat("Mimi");

        //When
        String actual = c.talk();

        //Then
        assertEquals("miau", actual);
    }

    @Test
    void testGetNameCat(){

        //Given - já testa criação de objeto
        Cat c = new Cat("Mimi");

        //When
        String actual = c.getName();

        //Then
        assertEquals("Mimi", actual);
    }

    
}
