Certainly! Below is a Java code snippet demonstrating a vulnerability related to insecure deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input: serialized object with malicious payload
            String userInput = "rO0ABXNyABVqYXZhLnV0aWwuUHJpb3JpdHlTZWN1cml0eQAAAAAAAAAAEwAAAB4cHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAA21hcHQAEkxqYXZhL2xhbmcvU3RyaW5nOwcAAAABcQB+AAF4cHNyACpjb20uZXhhbXBsZS5Db21tb24AAAAAAAAAAAAAAAAMMAAVncm91cHEAfgADdwQAAAAAeHBzcgA/Y29tLmV4YW1wbGUuQ29tbW9uAAAAAAAAAAAAAAEIAAZ1dAAGdmFsdWV4cgAQamF2YS91dGlsL0
