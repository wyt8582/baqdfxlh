import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "rO0ABXNyAA5qYXZhLmxhbmcuU3RyaW5n7vPdV4lZp8ABUwAAWNydAASTGphdmEvbGFuZy9TdHJpbmc7eHBzcgA+aW1wbA==";

        try {
            byte[] serializedData = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
