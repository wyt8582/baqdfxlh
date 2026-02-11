Sure, here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            // User input representing a serialized object
            String userInput = "rO0ABXNyACVqYXZhLnV0aWwuRGVmYXVsdENvbXBvbmVudAAAAAAAAAAECAAFMAARuYW1lcQB+AAF4cgAQamF2YS51dGlsLkRlZmF1bHRFeGNlcHRpb25zdAAWTGphdmEvbGFuZy9TdHJpbmc7eHBzcgA/aW1wbA==";

            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
