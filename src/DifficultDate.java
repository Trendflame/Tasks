import java.util.Date;

public class DifficultDate {
        public static void main(String[] args) {
            {
                Date current = new Date();
                System.out.print(current);
                {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(current);

                System.out.println(formatter.format(date));

            }}
        }}