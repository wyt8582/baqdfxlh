import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulated user input (serialized object)
        String userInput = "rO0ABXNyAB5qYXZhLnV0aWwuTGlua2VkSGFzaE1hcJ8dN3QZAwACRgAI";
        
        byte[] serializedObject = Base64.getDecoder().decode(userInput);
        
        try {
            ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object obj = in.readObject();
            
            // Assuming obj is used in some way
            // This can lead to remote code execution if malicious objects are deserialized
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
