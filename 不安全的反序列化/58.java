Sure, here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulating user input as a serialized object (malicious payload)
        String userInput = "rO0ABXNyAC5qYXZheC5tYW5hZ2VyLlJlc3BvbnNlAAAAAAAAAAICAAMAAABmcm9tTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wADWluc2VydE1ldGhvZE1vZGVsSQAJdHJhbnNmb3JtSQAMY29tLmp2YXguY29yZS5kZWxlZ2F0aW9uLkludGVybmV0LkNvbGxlY3Rpb25NYXRjaGVkJDFlMjRjMTI4LTkyOTQtNGIyOS05NTA1LTg0MmE1OTIyOGVkMCQ
