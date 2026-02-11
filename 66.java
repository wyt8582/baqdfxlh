import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object deserializedObject = ois.readObject(); // Insecure deserialization

            // Perform operations on the deserialized object
            // This is where the attacker can exploit the vulnerability by injecting malicious code in the serialized object

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
