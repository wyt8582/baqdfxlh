import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing serialized object

        try {
            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform operations on the deserialized object
            // This is where the vulnerability lies as an attacker can provide malicious serialized objects to execute arbitrary code
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
