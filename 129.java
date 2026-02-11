Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        // Simulating user input from an untrusted source (e.g., network, file)
        String userInput = "rO0ABXNyACdjb20uZXhhbXBsZS5Vc2VySW5mbyRJbmZvVXNlcgAAAAAAAAABAgACSQAKc2VyaWFsTnVtYmVyAAJbQqzzF/gGCFTgAgAAeHAAAAABdwQAAAADcQB+AAwAAAAEAAAAAXEAfgAJAAAAAG/wAAAAB4";

        try {
            // Deserialize the user input (supposed to be a User object)
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Cast the deserialized object to User
            User user = (User) obj;

            // Access the deserialized User object
            System.out.println
