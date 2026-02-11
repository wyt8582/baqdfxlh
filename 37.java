import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "eyJzdGF0aWMiOiJ1c2VyIn0="; // User-supplied serialized object (base64 encoded)
            
            byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bis);

            // Deserializing the object without proper validation
            Object obj = ois.readObject();
            
            // Here, the attacker can potentially inject malicious code in the serialized object

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
