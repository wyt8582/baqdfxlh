import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "abcdef"; // Simulating user input (should be obtained from an untrusted source)

        try {
            // Convert the user input string to a byte array
            byte[] serializedData = userInput.getBytes();

            // Deserialize the byte array without proper validation
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();

            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
