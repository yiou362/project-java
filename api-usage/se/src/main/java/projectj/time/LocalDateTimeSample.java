package projectj.time;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yale
 */
public class LocalDateTimeSample {
    public static void main(String[] args) {
//        String dateStr = "20240329";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        try {
//            Date d1 = sdf.parse(dateStr);
//            System.out.println(d1);
//        } catch (Exception e) {
//
//        }
        String a = "0.00";
        BigDecimal bigDecimal = new BigDecimal(a);
        System.out.println(bigDecimal);
    }

    private static void func1(Integer a) {
        a++;
    }
}
