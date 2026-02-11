import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serializedObject"; // Assume this is user input
        Object deserializedObject = deserializeObject(userInput);
        // Use the deserialized object without proper validation
    }

    public static Object deserializeObject(String serializedString) {
        try {
            byte[] data = Base64.getDecoder().decode(serializedString);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
