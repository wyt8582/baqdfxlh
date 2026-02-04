import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing a serialized object
            
            byte[] data = Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            // Assuming the deserialized object is a harmless object
            // This is where the vulnerability lies as an attacker can provide a malicious serialized object
            // which can lead to code execution or other security issues
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
