Sure, here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input containing a serialized object
            String userInput = "rO0ABXNyACVqYXZhLnV0aWwuUHJpb3JpdHlNYW5hZ2VyEuKv7dD4RQIAAkwABG5hbWVxAH4AAUwABGVtYWlsdAASTGphdmEvbGFuZy9TdHJpbmc7eHBwdwEAeA==";

            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Cast the deserialized object to a specific type (this is where the vulnerability lies)
            String email = (String) obj;
            
            System.out.println("Deserialized email: " + email);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
