Certainly! Here is an example Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulating user input (can be obtained from network or file)
            String userInput = "rO0ABXNyACVqYXZhLnV0aWwuRGVzdHJpYnV0ZUxvbmcAAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AIAAHhwAAAAAXQ=";
            
            // Deserialize the user input
            ByteArrayInputStream byteStream = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream objectStream = new ObjectInputStream(byteStream);
            Object deserializedObject = objectStream.readObject();
            
            // Cast and use the deserialized object
            if (deserializedObject instanceof String) {
                String message = (String) deserializedObject;
                System.out.println("Deserialized message: " + message);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
