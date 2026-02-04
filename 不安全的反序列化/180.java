import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInput in = new ObjectInputStream(bis);

            Object obj = in.readObject(); // Deserializing the user input

            // Perform operations with the deserialized object
            // This is where the vulnerability lies as an attacker can provide a malicious payload in the serialized object

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
