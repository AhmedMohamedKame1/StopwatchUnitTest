package stopwatch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StopWatchTest {
    @Test
    public void givenMultiplePositiveMinutes_whenIncrement_thenMinutesIncrease(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.increment(10);
        stopWatch.increment(20);
        assertEquals(30, stopWatch.getMinutes());
    }
}
