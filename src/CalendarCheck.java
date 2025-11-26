import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarCheck {


    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        Date dt= cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        System.out.println(sdf.format(dt));


//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH)+1;
//        int date = cal.get(Calendar.DATE);
//        System.out.println(date + "/" + month + "/" + year);

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().trim().split("/");

        cal.set(Calendar.DATE, Integer.parseInt(s[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(s[1])-1);
        cal.set(Calendar.YEAR, Integer.parseInt(s[2]));

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));



    }
}
