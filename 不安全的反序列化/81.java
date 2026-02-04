Certainly! Below is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        // Simulating user input (malicious serialized object)
        String userInput = "rO0ABXNyABVqYXZhLnV0aWwuUHJpb3JpdHlNYXAkSW50ZXJzb2Z0O3hwdAAkTm9uZU9iamVjdHQ7eHBxAH4ABA==";
        
        try {
            // Deserialize the user input
            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Unsafe casting of the deserialized object
            String command = (String) obj;
            
            // Execute the deserialized command (this is where the vulnerability lies)
            System.out.println("Executing command: " + command);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
