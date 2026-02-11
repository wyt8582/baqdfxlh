import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serializedObjectHere"; // User input containing serialized object

            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object deserializedObject = objectInputStream.readObject();

            // Perform operations on the deserialized object
            // This is where the vulnerability lies as an attacker can manipulate the serialized input to execute malicious code

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
