import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyADJqYXZhLmxhbmcuU3RyaW5nAAAAAAIAAloAA1kAAQABAAAADw=="; // Serialized object provided by user
            byte[] serializedObject = Base64.getDecoder().decode(userInput);

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInput in = new ObjectInputStream(bis);

            Object obj = in.readObject(); // Deserializing the object

            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
