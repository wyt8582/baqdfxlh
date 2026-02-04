import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulating user input (serialized object)
        String userInput = "rO0ABXNyABFqYXZhLnV0aWwuUHJpb3JpdHlTAAJaYWRkcmVzc2VzcgAQamF2YS51dGlsLlByaW9yaXR5";

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Perform some operation with the deserialized object
            // This is where the vulnerability lies, as an attacker could provide a malicious serialized object to exploit the system
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
