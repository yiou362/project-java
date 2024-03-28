package projectj.time;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Yale
 */
public class InstantSample {
    public static void main(String[] args) {
//        String data = "Hello, World!"; // 要写入文件的数据
//
//
//        String userHome = System.getProperty("user.home");
//        String directoryPath = userHome + File.separator + "temp-file";
//        String fileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
//        String filePath = directoryPath + File.separator + fileName;
//
//        File directory = new File(directoryPath);
//        if (!directory.exists()) {
//            directory.mkdirs(); // 创建目录及其父目录（如果不存在）
//        }
//
//        try (FileOutputStream writer = new FileOutputStream(filePath)) {
//            writer.write(data.getBytes());
//            writer.close();
//            System.out.println("数据已成功写入文件: " + filePath);
//        } catch (IOException e) {
//            System.out.println("写入文件时出现错误: " + e.getMessage());
//        }
//        System.out.println(new Date().toInstant().toString());
//        Instant i1 = new Date().toInstant();
//        Instant i2 = Instant.parse("1582-01-01T15:54:17.001Z");
//        System.out.println(i2.toEpochMilli());
//
//        System.out.println(i1.toString());
//        System.out.println(i2.toString());
//
//
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());
//        System.out.println(localDateTime);
//        System.out.println(Date.from(i2));
//        System.out.println(Date.from(i1));
//
//    System.out.println(System.currentTimeMillis());
//        System.out.println(i2.getEpochSecond());
//        StringBuilder sb = new StringBuilder();
//        sb.append("a");
//        sb.append("\n");

//        if(sb.charAt(sb.length() - 1) == '\n') {
//            System.out.println("true");
//            sb.deleteCharAt(sb.length() -  1);
//            System.out.println(sb);
//        }
//        System.out.println(sb.charAt(sb.length() - 1));
//        sb.deleteCharAt(sb.length() - 1);
//        System.out.println(sb.toString());

// 获取当前日期
        LocalDate localDate = LocalDate.now();

// 将日期设置为 12 月
        LocalDate newDate = localDate.withMonth(12);


// 转换为 java.util.Date 对象
        Date date = java.sql.Date.valueOf(newDate);
        System.out.println(date);
        System.out.println(new SimpleDateFormat("yyyy年M月d日 HH:mm:ss").format(new Date()));
    }
}
