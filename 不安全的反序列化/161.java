import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "rO0ABXNyACVkYW1hZGV2ZXJ0aWNhbnQuU3RyaW5nAAAAAAAAAAIAAkwABGxpbmVOdW1iZXJMAARuYW1ldAASTGphdmEvbGFuZy9TdHJpbmc7eHB0AANmb28=";
        byte[] serializedObject = userInput.getBytes();

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
