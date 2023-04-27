import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.*;

public class timezone_conversion
{

    public static void main(String[]args)

    {
        int ch=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to Time Conversion Project****");
        while (ch!=0)
        {

            System.out.println("Enter 1 to know the local date, time and timezone");
            System.out.println("Enter 2 to know all the timezones");
            System.out.println("Enter 3 to convert the local time to any other cou0"
            		+ ""
            		+ "ntry time zone");
            int nu= sc.nextInt();

        switch(nu){

            case 1:
                // TO SHOW THE CURRENT DATE,TIME AND TIMEZONE
                String date1 = new SimpleDateFormat("dd-MM-yy hh:mm:ss").format(Calendar.getInstance().getTime());
                String date2 = Calendar.getInstance().getTimeZone().getID();
                System.out.println("Local Date and Time:" + date1);
                System.out.println("Local Timezone:" + date2);
                break;
            case 2:
                // TO SHOW THE AVAILABLE TIMEZONES
                String[] id = TimeZone.getAvailableIDs();
                System.out.println("The available Timezones  are as follows:");
                for (int i = 0; i < id.length; i++)
                {
                    System.out.println(id[i]);
                }
                break;
            case 3:
                //TO CONVERT THE THE LOCAL TIMEZONE INTO THE COUNTRY TIMEZONE PROVIDED BY THE USER
                Scanner mz = new Scanner(System.in);
                String tz;
                System.out.println("Enter your Timezone id");
                tz = mz.nextLine();
                TimeZone.setDefault(TimeZone.getTimeZone(tz));
                SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                Date date=new Date();
                
                String current_date_time=date_format.format(date);

                System.out.println("The timezone has been chnaged succesfully!");
                System.out.println("Currnt Time and Date:" + current_date_time);
                System.out.println("Current Timezone:" + tz );
                break;
            default:
                System.out.println(" Enter 1 2 and 3 only");

        }
            Scanner t=new Scanner(System.in);
            System.out.println("DO YOU WANT TO CONTINUE?");
            System.out.println(("IF YES TYPE 1 ELSE TYPE 0"));
            ch= t.nextInt();

    }
    }
}
