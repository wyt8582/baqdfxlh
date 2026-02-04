import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_data_here"; // User input containing serialized data

        try {
            // Deserialize the user input
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
