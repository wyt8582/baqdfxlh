Sure, here is an example demonstrating a vulnerability related to insecure deserialization in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // User input - Serialized object as a Base64 string
            String serializedObject = "rO0ABXNyAC5qYXZhLnV0aWwuRGVzdHJpYnV0ZUxhbmd1YWdlAAAAAAAAAAECAAFaAA9MaW5lTGFuZ3VhZ2V0ABJMamF2YS9sYW5nL1N0cmluZzt4cHNyADdjb20uZXhhbXBsZS5HZW5lcmF0ZWREZXNydWludG9ubGluZVNlcmlhbGl6YXRpb25FeGFtcGxlAAAAAAAAAAEMAAB4cHcMAAlyYXcuamF2YQAAAQwAAHhwdwgAAAAAPwAAAAAAAAABAAAAAAAACAAAAAHhxAH4ABA==";

            // Deserialize the object
            byte[] bytes
