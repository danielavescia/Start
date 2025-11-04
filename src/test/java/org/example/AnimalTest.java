package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AnimalTest {

    static Stream<Object[]> animalNames() {
    return Stream.of(
        new Object[]{new Cat("Mimi"), "Bicho"},
        new Object[]{new Dog("Bud"), "Zelda"},
        new Object[]{new Cow("Mimosa"), "Flor"}
    );
}

//Testa get e set
@ParameterizedTest
@MethodSource("animalNames")
void testAnimalSetNames(Animal animal, String newName) {
    animal.setName(newName);
    assertEquals(newName, animal.getName());
}  

@Test
void testAnimalBlanckNameException(){
    IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
    () -> new Cat(" ") );
    assertEquals("O nome do animal não pode ser em branco", ex.getMessage());
}

@Test
void testAnimalNullNameException(){
    IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
    () -> new Dog(null) );
    assertEquals("O nome do animal não pode ser nulo", ex.getMessage());
}
}
