import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
public class HelpFormat {
    public static void main(String[] args) {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(String.valueOf(current));

        System.out.println(formatter.format(date));
    }
}