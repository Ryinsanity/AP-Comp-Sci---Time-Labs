//Name: Ryan Quach
public class Time{ // class header

    private int hour; // class variables
    private int minute;

    public Time(int h, int m) { // two arguement constructor
        hour = h;
        minute = m;
        if (hour < 0) //if hour is negative then make hour 0 
        hour = 0;
        if (minute < 0) //if minute is negative then make minute 0 
        minute = 0;
        if (hour > 23) {
        if (hour % 24 == 0)
        
        
    }

    public Time(){ //default constructor
        this(0,0);
    }

    public String toString() { //military time
        String ans = "";
        if (hour < 10) //adding 0 infront of hour time 
        {
            ans+="0";
        }
                if (minute < 10) //adding 0 infront of minute time 
        {
            ans+="0";
        }
        ans+=hour;
        ans+=minute;
        return ans;
        
    }

    public String convert() { //converting military time to 12 hour time
        String ans = "";
        ans += hour;
        ans += minute;
        return ans;
    }

    public void increment(int m) {

    }

    public static void main(String[] args) {
        Time t1 = new Time(7, 15);
        Time t2 = new Time(12, 10);
        Time t3 = new Time(-6,9);
        Time t4 = new Time(6,-9);
        System.out.println("Expected 1210 Actual " + t2);
        System.out.println("Expected 0715 Actual " + t1);
        System.out.println("Expected 0009 Actual " + t3);
        System.out.println("Expected 0600 Actual " + t4);
    }
}
