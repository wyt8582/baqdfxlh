import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyABFqYXZhLmxhbmcuUnVudGltZUV4Y2VwdGlvbp5cdKkM5sgCAAJMAAtvcmcuYXBhY2hlLmV4YW1wbGUuTmFtZUxvZ0V4YW1wbGV0aW1lSW5zdGFsbHQAAAAAAAAAAQIAAHhw";

        try {
            byte[] bytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            System.out.println(obj);

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
