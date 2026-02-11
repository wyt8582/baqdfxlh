import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing a serialized object

            // Deserialize the user input
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();

            // Perform some operation with the deserialized object
            // This could lead to security vulnerabilities if the deserialized object is malicious

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
