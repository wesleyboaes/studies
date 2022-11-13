package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2022-07-14T11:50:20Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        int minutes = cal.get(Calendar.MINUTE);

        int month = 1 + cal.get(Calendar.MONTH);/*Começa no valor ZERO, Janeiro = 0*/

        System.out.println(sdf.format(d));
        System.out.println();

        System.out.println("Minutes: " + minutes);
        System.out.println();

        System.out.println("Month: " + month);

        sc.close();
    }
}
