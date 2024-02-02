package projectj.io;

import lombok.Data;

import java.io.*;

/**
 * @author Yale
 */
public class ObjectOutputStreamSample {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\LPS\\Development\\idea-projects\\project-java\\api-usage\\se\\src\\main\\java\\projectj\\io\\obj.txt")));
            OosObJ obj = new OosObJ();
            obj.setId("11111");
            obj.setName("Yale");
            oos.writeObject(obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Data
    private static class OosObJ {
        String id;
        String name;
    }
}
