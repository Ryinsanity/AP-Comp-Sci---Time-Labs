//Name: Ryan Quach

import java.util.Set;

public class Time{ //class header

   private int hour; //class variable for hour
   private int minute; //class variable for minutes
   
   public Time(int h, int m){ //two argument constructors 
      hour = h;
      minute = m;
      if (hour < 0) //if hour is negative then make hour 0
         hour = 0; 
      if (minute < 0) //if minute is negative then make minute 0
         minute = 0; 
      if (minute > 59){ //if minute is greater than 59, then make it 
         hour += minute/60;
         minute = minute%60;
         }
      if (hour > 23) //if hour is greater than 23 then it will take the remainder of 24 and that will be the new hour
        hour = hour%24;
  }
   
   public Time(){
      this(0,0);
   
   }
   public String toString(){ //military time
      String ans="";
      if (hour < 10) //adding 0 infront of hour time
      ans+="0";
      ans+=hour;
      if (minute < 10) //adding 0 infront of minute time
      ans+="0";
      ans+=minute;
      return ans;
   }
   public String convert() {
      String ans = "";
      String x = "";
  
      if (hour == 0) { // Midnight
          ans = "12"; // set the hour to 12 for midnight
          x = "am"; // set the period to am for morning
      } 
      else if (hour >= 1 && hour < 12) { //check if the hour is between 1 and 11, which represents AM hours
          x = "am";
          ans = hour + ""; // Convert the hour to a string (no need to convert for AM hours)
      } else if (hour == 12) { // Noon
          x = "pm"; //Set the period to "pm" for afternoon
          ans = "12"; // Set the hour to "12" for noon
      } 
      // For all other hours (1 PM to 11 PM), convert to 12-hour format and set the period to "pm"
      else {
          x = "pm";
          ans = (hour % 12) + ""; // Convert military time to 12-hour time for PM hours
      }
  
      ans += ":"; //Add a colon between the hour and minute
  
      if (minute < 10) //add 0 to minute if it's less than 10
          ans += "0";
  
      ans += minute;
      ans += x; // add the period am or pm to the end
      return ans;
  }
   
   public void increment(int m){
      if (m>0) // if the m value is negative, it returns the minute; if the m value is greater than 0, it adds that increment to the minutes
         minute+=m;
      if (minute>59) //this adjusts the time if the minute value is greater than 59; the remaining time gets added to the hour
         hour+=minute/60;
         minute=minute%60;
   }
   
   public static void main(String[] args){
      Time t1 = new Time();
      Time t2 = new Time (-6,9);
      Time t3 = new Time (6,-9);
      Time t4 = new Time (7,15);
      Time t5 = new Time (23,125);
      Time t6 = new Time (14,9);
      Time t7 = new Time (12,10);
      Time t8 = new Time (23,40);
      Time t9 = new Time (07,15);
      Time t10 = new Time (11,50);
      Time t11 = new Time (10,10);
      Time t12 = new Time (-6,89);
      Time t13 = new Time (6,-89);
            t8.increment(30);
            t9.increment(150);
            t10.increment(-10);
            t11.convert();
            
      System.out.println("Expected Output 0000- Actual "+t1);
      System.out.println("Expected Output 12:00am- Actual "+t1.convert());
      System.out.println("Expected Output 0009- Actual "+t2);
      System.out.println("Expected Output 0600- Actual "+t3);
      System.out.println("Expected Output 7:15am- Actual "+t4.convert());
      System.out.println("Expected Output 0105- Actual "+t5);
      System.out.println("Expected Output 1:05am- Actual "+t5.convert());
      System.out.println("Expected Output 2:09pm- Actual "+t6.convert());
      System.out.println("Expected Output 1409- Actual "+t6);
      System.out.println("Expected Output 12:08pm- Actual "+t7.convert());
      System.out.println("Expected Output 0010- Actual "+t8);
      System.out.println("Expected Output 0945- Actual "+t9);
      System.out.println("Expected Output 1150- Actual "+t10);   
      System.out.println("Expected Output 10:10am- Actual " +t11.convert());
      System.out.println("Expected Output 0129- Actual " +t12);
      System.out.println("Expected Output 0600- Actual " +t13);
      }
}
