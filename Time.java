//Name: Ryan Quach

public class Time{ //class header

   private int hour; //class variable for hour
   private int minute; //class variable for minutes
   
   public Time(int h, int m){ //two argument constructors 
      hour = h;
      minute = m;
      if (hour < 0) //if hour is negative it is 0
         hour = 0; 
      if (minute < 0) //if minute is negative it is 0
         minute = 0; 
      if (minute > 59){ //if minute is greater than 59, than adjust the hour accordingly
         hour += minute/60;
         minute = minute%60;
         }
      if (hour > 23) //if hour is greater than 23, it takes the remainder of 24, which becomes the hour
        hour = hour%24;
  }
   
   public Time(){
      this(0,0);
   
   }
   public String toString(){
      String ans="";
      if (hour < 10) //if hour is greater than 24, it will add a zero to the beginning
      ans+="0";
      ans+=hour;
      if (minute < 10) //if minute is less than 10, it will add a zero before the minute value
      ans+="0";
      ans+=minute;
      return ans;
   }
   public String convert(){
      String ans="";
      String x="";
      if (hour == 24 || hour < 12) //if the time is 2400 or less than 1200, the time labels as "am"
         x="am";
      if (hour >= 12) //if the time is >=1200, the time labels as "pm"
         x="pm"; 
      ans+=hour%12; //converts military time to normal time
      ans+=":"; //adds the ":" that is depicted in normal time
      if (minute < 10) //adds a zero before the minute value if the minute is less than 10
         ans+="0";
      ans+=minute;
      ans+=x;
      return ans;
   }
   
   public void increment(int m){
      if (m>0) // if the m value is negative, it returns the minute; if the m value is greater than 0, it adds that increment to the minutes
         minute+=m;
         else minute=minute;
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
      
      t8.increment(30);
      System.out.println("Expected Output 0010- Actual "+t8);
     
      t9.increment(150);
      System.out.println("Expected Output 0945- Actual "+t9);
      
      t10.increment(-10);
      System.out.println("Expected Output 1150- Actual "+t10);   
      
      t11.convert();
      System.out.println("Expected Output 10:10am- Actual " +t11.convert());
      
      System.out.println("Expected Output 0129- Actual " +t12);
      System.out.println("Expected Output 0600- Actual " +t13);
      }
}
