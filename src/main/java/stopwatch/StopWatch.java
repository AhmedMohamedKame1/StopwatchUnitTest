package stopwatch;

public class StopWatch {
   int minutes;
   int hours;
   int days;

   public void increment(int min){
        if(min >= 0){
            this.minutes += min;
            this.hours += minutes/60;
            this.minutes = minutes%60;
            this.days += hours/24;
            this.hours = hours%24;
        }
   }

   public int getMinutes(){
        return this.minutes;
   }
   public int getHours(){
        return this.hours;
   }
   public int getDays(){
        return this.days;
   }

}
