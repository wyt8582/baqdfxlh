Sure, here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate receiving user input from an untrusted source
            String userInput = "rO0ABXNyADJqYXZhLnV0aWwuUHJpb3JpdHlRdWV1ZWTa7zDfZ9c4AgABTAAIZGVzZXJ2YWJsZVMAAltCrPMX+AYIVOACAAB4cAAAACNxAH4AAXhwdwQAAAAAeHB0AApjb250YWluZXJxAH4ABHNxAH4ABA==";

            byte[] serializedData = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            // Deserialize the object
            Object deserializedObject = ois.readObject();

            // Insecure deserialization vulnerability - an attacker could potentially exploit this to execute malicious code
            System.out.println("
