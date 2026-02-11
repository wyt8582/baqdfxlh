Sure, here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate receiving serialized object from user input
            String userInput = "rO0ABXNyACxqYXZhLmxhbmcuU3RyaW5nO3hwc3IALmpha2FuLlN0cmluZy4AcmVwb3J0UHJpbnQAAAAAAAAAAQIAAHhyAD9vcmcuYXBhY2hlLm1hbmFnZXIuSW5zZWN1cmVEZXNlcmlhbFBhcmFtZXRlcnK6fG6tKAIAAUwAA21hcHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACnByaW50bG4AAUwABGJpbmQAEExqYXZhL2xhbmcvU3RyaW5nO1sACnNxAH
