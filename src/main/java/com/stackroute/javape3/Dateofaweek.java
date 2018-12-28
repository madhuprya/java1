package com.stackroute.javape3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dateofaweek {
public String calender(String s)
{
    Calendar c = Calendar.getInstance();

    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

    System.out.println();

    DateFormat df = new SimpleDateFormat("EEEEEE dd/MM/yyyy");

    String date = "First day of week : "+df.format(c.getTime());


    for (int i = 0; i <6; i++) {
        c.add(Calendar.DATE, 1);
    }
    date+=" Last day of week : "+df.format(c.getTime());
    return date;

}
}
