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

    @Test
    public void givenNegativeMinutes_whenIncrement_thenMinutesShouldNotChange(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.increment(20);
        stopWatch.increment(-10);
        assertEquals(20, stopWatch.getMinutes());
    }

    @Test
    public void givenMinutesReache60_whenIncrement_thenHoursShouldIncrement(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.increment(30);
        stopWatch.increment(30);
        assertEquals(1, stopWatch.getHours());
    }

    @Test
    public void givenHoursReaches24_whenIncrement_thenDaysShouldIncrement(){
        StopWatch stopWatch = new StopWatch();
        for(int i = 0; i < 24; i++){
            stopWatch.increment(60);
        }
        assertEquals(1, stopWatch.getDays());
    }

}
