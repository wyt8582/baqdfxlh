import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "serializedData"; // User input containing serialized data

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();

            // This is where the insecure deserialization vulnerability exists
            // The obj object may contain malicious code that could be executed
            // without proper validation or sanitization

            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
