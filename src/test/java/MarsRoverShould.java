import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MarsRoverShould {

    private MarsRover rover;
    private Commander commander;

    @BeforeEach
    void setup() {
        rover = new MarsRover();
        commander = new Commander();
    }

    @ParameterizedTest
    @CsvSource({
            "R, E",
            "RR, S",
            "RRR, W",
            "RRRR, N",
    })
    public void turn_right(String input, String expectedOutput) {
        assertEquals(expectedOutput, rover.execute(input));
    }

    @ParameterizedTest
    @CsvSource({
            "L, W",
            "LL, S",
            "LLL, E",
            "LLLL, N",
    })
    public void turn_left(String input, String expectedOutput) {
        assertEquals(expectedOutput, rover.execute(input));
    }

    @ParameterizedTest
    @CsvSource({
            "M, W",
            "MM, S",
            "MMM, E",
            "MMMM, N",
            "MMMMM, N",
            "MMMMMM, N",
            "MMMMMMM, N",
            "MMMMMMMM, N",
            "MMMMMMMMM, N",
    })
    public void move(String input, String expectedOutput) {
        assertEquals(expectedOutput, rover.execute(input));
    }
}
