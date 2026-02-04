import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyADJqYXZheC5tYWluLkltYWdlzghDz1A8RQ4ADAABHQAEWVd9KU/fQQ=";
        byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);

        try {
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
