Sure, here is an example of a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        try {
            // Simulating user input as serialized data
            String userInput = "rO0ABXNyACRqYXZhLnV0aWwuQ29uZmlndXJhdGlvbkNvbnN0YW50UHJveHkAAAAAAAAAAQIAAVsABW1vZGlmaWNhdGlvbnQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACG5hbWV0ABJMamF2YS9sYW5nL1N0cmluZzt4cAAAAAAAD/////dXIAAltCrPMX+AYIVOACAAB4cHQADFVJTlRSQU5DRUQ=";

            // Deserialize user input without proper validation
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in
