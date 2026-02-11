import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Assume userInput contains a serialized object from an untrusted source
        String userInput = "YOUR_SERIALIZED_OBJECT_HERE";

        try {
            // Deserialize the object from the userInput
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform operations using the deserialized object
            // This is where the vulnerability lies, as an attacker could manipulate the serialized data to execute malicious code

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
