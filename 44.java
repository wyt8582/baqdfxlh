import java.io.*;

public class InsecureDeserializationDemo {
    
    public static void main(String[] args) {
        String userInput = "serializedObject"; // User input that contains a serialized object
        
        try {
            // Deserialize the object from user input
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(userInput.getBytes()));
            Object obj = ois.readObject();
            
            // Perform operations on the deserialized object
            // This is where the vulnerability lies, as the deserialized object could be malicious and lead to code execution
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
