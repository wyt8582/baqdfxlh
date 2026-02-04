Sure, here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulating user input (serialized object)
            String userInput = "rO0ABXNyACJqYXZhLnV0aWwuUHJpb3JpdHkuSGFzaENvZGVQcm94eQAAAAAAAAABAgACSQAEc2l6ZUwACmNvbGxhcHN0ABBMamF2YS91dGlsL0NvbGxhcHNxAH4AAUwAA21ldGhvZEZybQBFeGNsdWRlSGFzaFNldIJ0s9bS8ZAIAAHhwAAAAAHhxAH4AAUwABHNpemVzdAAuY29sbGFwc3QBAAG9AAFfRU9GOi8vYmluL2hvc3R1bm5zL2hlbHAvcGVyc29uYWxTYW1wbGUuaW1wbA==";
