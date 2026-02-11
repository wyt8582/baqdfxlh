Certainly! Below is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String userInput = "rO0ABXNyAC5qYXZheC5tYWlubGluZS5EYXRhAAAAAAAAAAECAAFMAAVjbGFzc3QAEUxqYXZhL2xhbmcvU3RyaW5nO0wABGZpbGVoZWkAEExqYXZhL2xhbmcvZmllbGQ7TAAFcGFyYW1ldGVyAAtMamF2YS9sYW5nL1N0cmluZzt4cAAAAAAAAAABAAAAAGdAAAGb3JpZ2luYWw=";

        // Deserialize the object from the user input
        ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        
        // Cast the deserialized object to
