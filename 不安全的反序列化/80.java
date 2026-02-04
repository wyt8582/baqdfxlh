Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input representing a serialized object
            String userInput = "rO0ABXNyAA9qYXZhLnV0aWwuUHJpb3JpdHlFeGNlcHRpb25zLkV4Y2VwdGlvbgAAAAAAAAABAgADTAAIaW50ZWdlckxhbmd1YWdlcQB+AANMAARuYW1lcQB+AAF4cAAAAAFzcQB+AAQ=";
            
            // Deserialize the object from user input
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(userInput)));
            Object obj = in.readObject();
            
            // Do something with the deserialized object (e.g., cast it to a known type)
            String deserializedString = (String) obj;
            
            System.out.println("Deserialized object: " + deserializedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
``
