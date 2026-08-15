package stopwatch;

public class StopWatch {
   int minutes;
   int hours;

   public void increment(int min){
        if(min >= 0){
            this.minutes += min;
            this.hours += minutes/60;
            this.minutes = minutes%60;
        }
   }

   public int getMinutes(){
        return this.minutes;
   }
   public int getHours(){
        return this.hours;
   }

}
