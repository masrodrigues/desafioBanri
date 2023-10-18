package Framework.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static String getDateTimeFormatReport(){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        return dateFormat.format(now);
    }
    public static String getDateFormatScreenshot(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'h'mm'm's's'");
        LocalDateTime localDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(localDateTime);
    }
}
