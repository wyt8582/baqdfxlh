import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObject"; // Simulated user input
        
        // Deserialize the user input (unsafe)
        deserializeUserInput(userInput);
    }

    private static void deserializeUserInput(String userInput) {
        try {
            // Convert the serialized user input back to an object
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            // Read the object from the stream
            Object obj = ois.readObject();
            
            System.out.println("Deserialized object: " + obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
