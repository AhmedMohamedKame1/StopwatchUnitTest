package stopwatch;

public class StopWatch {
   int minutes;
   int hours;

   public void increment(int min){
        if(min >= 0){
            this.minutes += min;
        }
   }

   public int getMinutes(){
        return this.minutes;
   }
   public int getHours(){
        return this.hours;
   }

}
