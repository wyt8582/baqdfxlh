Certainly! Here is an example Java code snippet demonstrating a vulnerability related to insecure deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulating user input (base64 encoded serialized object)
        String userInput = "rO0ABXNyAC5qYXZheC5tYW5hZ2VyLlRlc3Rlcm9jYWxlSW5mbwAAAAAAAAABAgAAeHIAE2phdmF4Lm1hbmFnZXIuVGVzdGVyb2NhbGUAAAAAAABzcgA/Y29tLmV4YW1wbGUuaWJtLkluY29ycC5FeGFtcGxlSWNvbnQAAAAAAAAAAQIAAHhw";

        byte[] serializedObject = Base64.getDecoder().decode(userInput);

        try {
            // Deserialize the object without proper validation
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object obj = in.readObject();
            in.close();

            // Use the deserialized object
