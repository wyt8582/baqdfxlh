Certainly! Here is a Java code snippet that demonstrates an insecure deserialization vulnerability:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input - Serialized object
            String userInput = "rO0ABXNyACFqYXZhLmxhbmcuU3RyaW5nO5DcCR4hACwwAAS0AAUxvcmcvYXBhY2hlL01hcDt4cAAAAAAAAAABAAAAAXQABG1vZGlmaWNhdGlvbnQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACnRvTm9kZU9iamVjdHQAEkxqYXZhL2xhbmcvT2JqZWN0O3hwc3IADmphdmEubGFuZy5PYmplY3QAAAAAAAAAAHhwdwgAAAAAAP/wAAAAAAAwAAADE=";
            
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
