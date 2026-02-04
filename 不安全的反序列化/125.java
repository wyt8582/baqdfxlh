import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing a serialized object
        
        try {
            // Deserialize the user input
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            
            // Perform operations on the deserialized object
            // This is where the vulnerability lies as an attacker can provide malicious serialized objects
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
