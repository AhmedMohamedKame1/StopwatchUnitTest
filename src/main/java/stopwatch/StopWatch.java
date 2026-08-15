package stopwatch;

public class StopWatch {
   int minutes;

   public void increment(int min){
    this.minutes = min;
   }

   public int getMinutes(){
    return this.minutes;
   }
}
