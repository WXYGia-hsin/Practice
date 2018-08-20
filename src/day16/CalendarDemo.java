package day16;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println( c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));

    }
}
