Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyAC5qYXZhLnV0aWwuRGVzdHJveZm72rQdCfAwAAeHBzcgA2amF2YS5pby5lbnYuRXhjZXB0aW9uSW50ZXJnYW5xAhZ6MgCAy173AgABTAALYWNjb3VudHQAFkxqYXZhL2xhbmcvU3RyaW5nO0wADWRlcmVnYXRldAASTGphdmEvbGFuZy9TdHJpbmc7TAAFZ2V0UnVudGltZXQAEkxqYXZhL3V0aWwvU29mdHdhcmU7eHBwcA==";

        try {
            byte[] serializedBytes = Base64.getDecoder().decode(serializedObject);
            ByteArrayInputStream
