package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TalkableTest {

    //Stream = arrai de objetos (animal, som) - Arguments.of
    static Stream<Object[]> talkables(){
        return Stream.of(
            new Object[]{new Cow("Mimosa"), "muuu"},
            new Object[]{new Cat("Mimi"), "miau"},
            new Object[]{new Dog("Bud"), "au-au"},
            new Object[]{new Radio(), "Rádio gaúcha"}
        );
    }

    @ParameterizedTest
    @MethodSource("talkables")
    void testTalk(Talkable t, String expectedSound){
        assertEquals(expectedSound, t.talk());
    }
}
