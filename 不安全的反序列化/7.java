import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User-provided serialized object

            // Deserialize the user-provided input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Unsafe operation with the deserialized object (e.g., casting to a specific class)
            if (obj instanceof String) {
                String deserializedString = (String) obj;
                System.out.println("Deserialized string: " + deserializedString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
