import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @ParameterizedTest
    @CsvSource({
            "R, E",
            "RR, S",
            "RRR, W",
    })
    public void turn_right(String input, String expectedOutput){
        MarsRover rover = new MarsRover();

        String result = rover.calculate(input);

        assertEquals(expectedOutput, result);
    }
}
