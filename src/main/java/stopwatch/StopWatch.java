package stopwatch;

public class StopWatch {
   int minutes;

   public void increment(int min){
        if(min >= 0){
            this.minutes += min;
        }
   }

   public int getMinutes(){
    return this.minutes;
   }
}
