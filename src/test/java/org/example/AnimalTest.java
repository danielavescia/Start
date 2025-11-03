package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

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
}
