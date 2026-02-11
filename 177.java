Certainly! Here's an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulating user input which contains malicious serialized object
        String userInput = "rO0ABXNyACdjb20uZXhhbXBsZS5PcmRlck1hbmFnZWRJbnNlY3VyZU9iamVjdAAAAAAABDAAAeHIAEGlsbGVnYWwuc3Vic2NyaWJlci5zZXJpYWxpemVkLk9wZW5TZXJpYWxpemF0aW9uUHJpb3JpdGVyAAAAAAAAAAECAAB4cgAzaWxsZWdhbC5zdWJzY3JpYmVyLmNvbW1vbi5TdGFydAAAAAAAAAASAAB4cHNyACxqYXZhLnV0aWwuQ29sbGVjdGlvbnMkRGVmYXVsdEhpZXIAAAAAAAAAAQIADHByb2N
