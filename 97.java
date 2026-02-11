Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate receiving user input (serialized object) from an untrusted source
            String userInput = "rO0ABXNyAC5qYXZheC5pbnNlYy5TZXJpYWxpemF0aW9uRXhjZXB0aW9uc1Rlc3QAAAAAAAAAAAIAAHhyACFqYXZheC5pbnNlYy5TZXJpYWxpemF0aW9uU2VyaWFsaXphdGlvbgAAAAAAAAAAAgABTAAGaW1wbANGb28uamF2YQAAAAAAAAA=";

            byte[] serializedObject = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));

            // Deserialize the object without proper validation
            Object deserializedObject = ois.readObject();

            System.out.println(deserializedObject);
