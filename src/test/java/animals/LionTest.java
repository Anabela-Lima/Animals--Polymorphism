package animals;

import animals.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    private Lion lion;

    @BeforeEach
    void setup(){
        lion = new Lion("Simba", 28, "zebra", false);
    }


    // canMakeNoise() - not passing an argument
    @Test
    void canMakeNoise__noArgument(){
        assertEquals("Roar!", lion.makeNoise());
    }


    // canMakeNoise() - passing an argument i.e. a string- note you write the argument upon calling method
    @Test  // we dont want test to return anything just priting to console

    void canMakeNoise__withArgument(){
        assertEquals("I'm going to say: hello world", lion.makeNoise("hello world"));
    }


}
