import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "your malicious payload here"; // User input containing malicious payload

            byte[] serializedData = userInput.getBytes(); // Simulating deserialization of user input

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing the object without proper validation

            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
